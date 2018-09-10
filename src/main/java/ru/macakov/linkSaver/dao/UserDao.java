package ru.macakov.linkSaver.dao;


import org.springframework.stereotype.Repository;
import ru.macakov.linkSaver.model.Link;
import ru.macakov.linkSaver.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Repository
public class UserDao {

    String url = "jdbc:postgresql://ec2-54-217-236-201.eu-west-1.compute.amazonaws.com:5432/d3a7rkf8gu48r7";
    String username = "lsklzbqitivrms";
    String pass = "f4403afeff5ec7f09b14c63db85d2b611ef993ba2c7865e475d68e85a3f159ca";
    String ssl = "true";
    String sslfactory = "org.postgresql.ssl.NonValidatingFactory";



    public void save(User user) throws SQLException {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connect().prepareStatement("insert into users (login, firstname, lastname, email, password) values (?, ?, ?, ?, ?)");
            preparedStatement.setString(1, user.getLogin());
            preparedStatement.setString(2, user.getFirstName());
            preparedStatement.setString(3, user.getLastName());
            preparedStatement.setString(4, user.getEMail());
            preparedStatement.setString(5, user.getPassword());
            preparedStatement.execute();
            System.out.println("Новый пользователь добавлен в БД");
        }catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("Ошибка при сохранении!");
        }finally {
            preparedStatement.close();
        }
    }

    public User get(String login) throws SQLException {
        Statement statement = connect().createStatement();
        ResultSet resultSet = null;
        User user = new User();
        try {
            resultSet = statement.executeQuery("select * from users where login = '" + login + "'");
            if (resultSet != null) {
                resultSet.next();
                user.setLogin(resultSet.getString(2));
                user.setFirstName(resultSet.getString(3));
                user.setLastName(resultSet.getString(4));
                user.setEMail(resultSet.getString(5));
                user.setPassword(resultSet.getString(6));
            }
        } catch (SQLException ex) {
            System.err.println("ошибка в выборке");
            ex.printStackTrace();
            ex.getErrorCode();
            ex.getMessage();
        } finally {
            if (resultSet != null)
                resultSet.close();
            else {
                System.err.println("Ошибка чтения данных с БД!");
            }
            return user;
        }
    }

    public List<User> getAll() throws SQLException {
        Statement statement = connect().createStatement();
        ResultSet resultSet = null;
        List<User> users = new ArrayList();
        try {
            resultSet = statement.executeQuery("select * from users");
            while (resultSet.next()) {
                User user = new User();
                user.setLogin(resultSet.getString(2));
                user.setFirstName(resultSet.getString(3));
                user.setLastName(resultSet.getString(4));
                user.setEMail(resultSet.getString(5));
                user.setPassword(resultSet.getString(6));
                users.add(user);
            }
        } catch (SQLException ex) {
            ex.getErrorCode();
        }
        finally {
            if (resultSet != null)
                resultSet.close();
            else  {
                System.err.println("Ошибка чтения данных с БД!");
            }
        }

        return users;
    }

    public void remove(String login) {
        try {
            Statement statement = connect().createStatement();
            statement.executeUpdate("delete from users where login = '" + login + "'");
            System.out.println("Пользователь " + login + " удален");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Ошибка при удалении");
        }
    }

    public void addLink(User user,Link link) {

    }


    public List<Link> getAllLink(User user) {
        return user.getPersonListLink();
    }

    private Connection connect() {
        Connection connection = null;
        Properties properties = new Properties();

        properties.setProperty("user", username);
        properties.setProperty("password", pass);
        properties.setProperty("ssl", ssl);
        properties.setProperty("sslfactory", sslfactory);

        try {
            connection = DriverManager.getConnection(url,properties);
            System.out.println("connect postgreSQL server successful!!!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
}

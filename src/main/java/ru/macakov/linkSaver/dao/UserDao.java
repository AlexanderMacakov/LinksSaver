package ru.macakov.linkSaver.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
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


//todo 2) изменить подключение к базе через HikariCP к PostgresSQL
    

   public Connection connect() {
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


    public void save(User user) {

    }

    public User get(String login)  {
        return new User();
    }

    public List<User> getAll() throws SQLException{
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

        return users;
    }

    public void remove(String login) {

    }

}

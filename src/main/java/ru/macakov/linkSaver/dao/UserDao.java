package ru.macakov.linkSaver.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.macakov.linkSaver.model.User;

import java.util.List;

@Repository
public class UserDao {

//todo 1) сделать коннект к базе чере JDBC
//todo 2) изменить подключение к базе через HikariCP к PostgresSQL


    public void save(User user) {

    }

    public User get(String login) {
    }

    public List<User> getAll() {

    }

    public void remove(String login) {

    }

}

package ru.macakov.linkSaver.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.macakov.linkSaver.dao.UserDao;
import ru.macakov.linkSaver.entity.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;


    public void add(User user) {

    }

    public void update(User user) {

    }


    public User get(String login) {
       return new User();
    }

    public void remote(String login) {

    }

    public List<User> getAll() {
        return new ArrayList<User>();
    }


}

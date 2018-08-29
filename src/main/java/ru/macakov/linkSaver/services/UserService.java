package ru.macakov.linkSaver.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.macakov.linkSaver.dao.UserDao;
import ru.macakov.linkSaver.model.User;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;


    public void add(User user) {
        userDao.save(user);
    }

    public void update(User user) {
        userDao.save(user);
    }


    public User get(String login) {
        return userDao.get(login);
    }

    public void remote(String login) {
        userDao.remove(login);
    }

    public List<User> getAll() {
        return userDao.getAll();
    }


}

package ru.macakov.linkSaver.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import ru.macakov.linkSaver.model.User;

import java.util.List;

public class UserDao {

    @Autowired
    private MongoOperations mongoOperations;

    public void save(User user) {
        mongoOperations.save(user);
    }

    public User get(String login) {
        return mongoOperations.findOne(Query.query(Criteria.where("login").is(login)), User.class);
    }

    public List<User> getAll() {
        return mongoOperations.findAll(User.class);
    }

    public void remove(String login) {
        mongoOperations.remove(Query.query(Criteria.where("login").is(login)), User.class);
    }

}

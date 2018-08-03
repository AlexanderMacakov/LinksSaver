package ru.macakov.linkSaver.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;
import ru.macakov.linkSaver.model.Link;

@Repository
public class LinkDao {

    @Autowired
    private MongoOperations mongoOperations;

    public void save(Link link) {
        mongoOperations.save(link);
    }


}

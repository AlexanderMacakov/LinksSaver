package Connections;

import Entity.Person;
import com.mongodb.*;

import java.net.UnknownHostException;
import java.util.Properties;

public class ConnectMongo {

    private MongoClient mongoClient;
    private DB db;

    private boolean authenticate;

    private DBCollection table;

    public ConnectMongo(Properties prop) {
        try {
            mongoClient = new MongoClient(prop.getProperty("localhost"), Integer.valueOf(prop.getProperty("27017")));

            db = mongoClient.getDB("Users");

            table = db.getCollection(prop.getProperty("table"));
        } catch (UnknownHostException e) {
            // Если возникли проблемы при подключении сообщаем об этом
            System.err.println("Don't connect!");
        }
    }

    public void add(Person person) {

        BasicDBObject document = new BasicDBObject();

        document.put("firstName", person.getFirstName());
        document.put("lastName", person.getLastName());
        document.put("email", person.getEMail());
        document.put("password", person.getEMail());

        table.insert(document);
    }

    public Person getByPerson(String lastName) {
        BasicDBObject query = new BasicDBObject();

        query.put("lastName", lastName);
        DBObject rezult = table.findOne(query);

        Person person = new Person(String.valueOf(rezult.get("login")),
                                   String.valueOf(rezult.get("firstName")),
                                   String.valueOf(rezult.get("lastName")),
                                   String.valueOf(rezult.get("eMail")),
                                   String.valueOf(rezult.get("password")));

        return person;

    }


}

package Connections;

import Entity.Person;
import com.mongodb.*;

import java.net.UnknownHostException;

public class ConnectMongo {

    private MongoClient mongoClient;
    private DB db;


    private DBCollection table;

    public ConnectMongo() {
        try {
            mongoClient = new MongoClient("localhost",27017);

            db = mongoClient.getDB("LinksSaver");

            table = db.getCollection("Users");
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

    public Person getByPerson(String login) {
        BasicDBObject query = new BasicDBObject();

        query.put("login", login);
        DBObject rezult = table.findOne(query);

        Person person = new Person(String.valueOf(rezult.get("login")),
                                   String.valueOf(rezult.get("firstName")),
                                   String.valueOf(rezult.get("lastName")),
                                   String.valueOf(rezult.get("eMail")),
                                   String.valueOf(rezult.get("password")));

        return person;

    }


}

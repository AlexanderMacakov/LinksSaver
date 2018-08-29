package ru.macakov.linkSaver.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document(collection = User.COLLECTION_NAME)
public class User {

    public static final String COLLECTION_NAME = "Users";

    private String login;
    private String firstName;
    private String lastName;
    private String eMail;
    private String password;
    private List <Link> personListLink = new ArrayList();


}

package ru.macakov.linkSaver.model;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class User {

    public static final String COLLECTION_NAME = "Users";

    private String login;
    private String firstName;
    private String lastName;
    private String eMail;
    private String password;
    private List <Link> personListLink = null;


}

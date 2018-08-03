package ru.macakov.linkSaver.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = User.COLLECTION_NAME)
public class User {

    public static final String COLLECTION_NAME = "Users";

    private String login;
    private String firstName;
    private String lastName;
    private String eMail;
    private String password;
    private List <Link> personListLink = new ArrayList();


    public User() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Link> getPersonListLink() {
        return personListLink;
    }

    public void addLink(Link link) {
        this.personListLink.add(link);
    }

    @Override
    public String toString() {
        return "Пользователь: " + firstName + " " + lastName;
    }


}

package ru.macakov.linkSaver.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = User.COLLECTION_NAME)
public class User {

    public static final String COLLECTION_NAME = "users";

    private String login;
    private String firstName;
    private String lastName;
    private String eMail;
    private String password;
    private List <Link> personListLink = new ArrayList();


    private User() {

    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(String login,String firstName, String lastName, String eMail, String password) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.password = password;

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

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
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

    public void setPersonListLink(List<Link> personListLink) {
        this.personListLink = personListLink;
    }

    @Override
    public String toString() {
        return "Пользователь: " + firstName + " " + lastName;
    }
}

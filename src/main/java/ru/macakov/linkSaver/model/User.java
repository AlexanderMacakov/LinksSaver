package ru.macakov.linkSaver.model;



import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class User {


    private String login;
    private String firstName;
    private String lastName;
    private String eMail;
    private String password;
    private List <Link> personListLink = new ArrayList();


    public User() {

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

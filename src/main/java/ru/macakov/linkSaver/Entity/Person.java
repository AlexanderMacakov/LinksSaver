package ru.macakov.linkSaver.Entity;

import java.util.ArrayList;
import java.util.List;

public class Person implements ActionUser {

    private String login;
    private String firstName;
    private String lastName;
    private String eMail;
    private String password;
    private List <Link> personListLink = new ArrayList();

    private Person() {

    }

    public Person(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public Person(String login,String firstName, String lastName, String eMail, String password) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.password = password;

    }

    @Override
    public void read() {

    }

    @Override
    public void addLink(Link link) {
        personListLink.add(link);
    }

    @Override
    public void delLink(String tittle) {
        for (Link delLink: personListLink) {
            if (tittle.equals(delLink.getTittle())) {
                personListLink.remove(delLink);
            }
        }
    }

    @Override
    public void editLink(Link link) {

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

    public void setPersonListLink(List<Link> personListLink) {
        this.personListLink = personListLink;
    }

    @Override
    public String toString() {
        return "Пользователь: " + firstName + " " + lastName;
    }
}

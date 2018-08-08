package ru.macakov.linkSaver.model;

import lombok.Data;

import javax.persistence.Column;

@Data
public class UserInfo {

    private String login;
    private String firstName;
    private String lastName;
    private String password;
    private String eMail;

}

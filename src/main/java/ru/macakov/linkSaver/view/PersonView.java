package ru.macakov.linkSaver.view;

import ru.macakov.linkSaver.entity.Link;
import ru.macakov.linkSaver.entity.Person;

public class PersonView {

    public static void PersonView(Person person) {
        System.out.println(person.getId());
        System.out.println(person.getLogin());
        System.out.println(person.getFirst_name());
        System.out.println(person.getLast_name());
        System.out.println(person.getEmail());
        System.out.println("Person Links");
        for (Link link: person.getLinks()) {
            System.out.println(link.getId());
            System.out.println(link.getTitle());
            System.out.println(link.getDescription());
            System.out.println(link.getUrl());
            System.out.println(link.getPerson());
            System.out.println("-------------------------------");
        }
    }
}

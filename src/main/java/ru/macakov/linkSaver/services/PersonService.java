package ru.macakov.linkSaver.services;

import ru.macakov.linkSaver.dao.PersonDao;
import ru.macakov.linkSaver.dao.PersonDaoImpl;
import ru.macakov.linkSaver.entity.Person;
import ru.macakov.linkSaver.entity.Link;

import java.util.List;

public class PersonService {

    private PersonDao personDao = new PersonDaoImpl();

    public PersonService() {

    }

    public Person findPerson(int id) {
        return personDao.findById(id);
    }

    public void savePerson(Person person) {
        personDao.save(person);
    }

    public void deletePerson(Person person) {
        personDao.delete(person);
    }

    public void updatePerson(Person person) {
        personDao.update(person);
    }

    public Link findLinkById(int id) {
        return personDao.findLinkById(id);
    }

    public List<Person> findAllPerson() {
        return personDao.findAll();
    }
}

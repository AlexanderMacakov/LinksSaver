package ru.macakov.linkSaver.dao;

import ru.macakov.linkSaver.entity.Person;
import ru.macakov.linkSaver.entity.Link;

import java.util.List;

public interface PersonDao {

    /**
     * Получить Person по id
     * @param id
     * @return
     */
    Person findById(int id);


   /**
    * Сохранить Person
    * @param person
    */
    void save(Person person);

    /**
     * Обновить Person
     * @param person
     */
    void update(Person person);

    /**
     * Удалить Person
     * @param person
     */
    void delete(Person person);

    /**
     * Найти ссылку в Person по id
     * @param id
     * @return
     */
    Link findLinkById(int id);

    /**
     * Найти всех Person
     * @return
     */
    List<Person> findAll();
}

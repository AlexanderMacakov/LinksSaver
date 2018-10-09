package ru.macakov.linkSaver.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.macakov.linkSaver.entity.Link;
import ru.macakov.linkSaver.entity.Person;
import ru.macakov.linkSaver.utils.HibernateSessionFactoryUtil;

import java.util.List;

public class PersonDaoImpl implements PersonDao {

    @Override
    public Person findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Person.class, id);
    }

    @Override
    public void save(Person person) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(person);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Person person) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(person);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Person person) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(person);
        transaction.commit();
        session.close();
    }

    @Override
    public Link findLinkById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Link.class, id);
    }

    @Override
    public List<Person> findAll() {
        List<Person> persons = (List<Person>) HibernateSessionFactoryUtil.getSessionFactory().openSession();
        return persons;
    }
}

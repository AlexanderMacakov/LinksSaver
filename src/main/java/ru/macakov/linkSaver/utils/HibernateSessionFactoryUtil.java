package ru.macakov.linkSaver.utils;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import ru.macakov.linkSaver.entity.Link;
import ru.macakov.linkSaver.entity.Person;

public class HibernateSessionFactoryUtil {

    private static SessionFactory sessionFactory;


    private HibernateSessionFactoryUtil() {

    }

    public static SessionFactory getSessionFactory() {

        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(Person.class);
                configuration.addAnnotatedClass(Link.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());
            }
            catch(HibernateException exception){
                System.out.println("Problem creating session factory");
                exception.printStackTrace();
            }
        }
        return sessionFactory;
    }

}

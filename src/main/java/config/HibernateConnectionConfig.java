package config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateConnectionConfig {
    public static SessionFactory sessionFactory;

    private HibernateConnectionConfig() {
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            sessionFactory = new Configuration().configure("config/hibernate.cfg.xml").
                    buildSessionFactory();
        }
        return sessionFactory;
    }

    public static synchronized Session getSession() {
        return getSessionFactory().openSession();
    }

}

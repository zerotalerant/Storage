package Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();
    public static SessionFactory buildSessionFactory() {
        try {
            return new Configuration ().configure().buildSessionFactory();
        } catch (Exception e) {
            System.err.println("SessionFactory not created" + e.getMessage());
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory ()
    {
        return null;
    }
}

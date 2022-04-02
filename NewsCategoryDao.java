package Dao;

import Entity.NewsCategory;
import Utills.HibernateUtills;
import jdk.jfr.Category;
import org.hibernate.Session;

import java.util.List;

public class NewsCategoryDao {

    //--------------------------------------------\\

    public String addNewNewsCategory ( NewsCategory newNewsCategory )
    {
        try
        {
            Session session = HibernateUtills.buildSessionFactory ().openSession ();
            session.beginTransaction ();
            session.save ( newNewsCategory );
            session.getTransaction ().commit ();
            session.close ();
        } catch (Exception e)
        {
            System.out.println ( e.getMessage () );
        }
        return null;
    }

    //--------------------------------------------\\

    public NewsCategory changeCategoryName ( Category pastCategoryName, String newCategoryName )
    {
        try
        {
            Session session = HibernateUtills.buildSessionFactory ().openSession ();
            session.beginTransaction ();
            List<NewsCategory> newsCategories = session.createQuery ( "from Entity.NewsCategory where newsCategory =:pastName", NewsCategory.class ).
                    setParameter ( "pastName", pastCategoryName ).list ();
            if ( newsCategories != null )
            {
                NewsCategory newsCategory = newsCategories.get ( 0 );
                newsCategory.setNewsCategory ( newCategoryName );
                session.update ( newsCategory );
                session.getTransaction ().commit ();
                session.close ();
            }
        } catch (Exception e)
        {
            System.out.println ( e.getMessage () );
        }
        return null;
    }

    //--------------------------------------------\\

    public List<NewsCategory> getAllCategory ()
    {
        List<NewsCategory> categoryList;
        try
        {
            Session session = HibernateUtills.buildSessionFactory ().openSession ();
            session.beginTransaction ();
            categoryList = session.createQuery ( "from Entity.NewsCategory", NewsCategory.class ).list ();
            session.getTransaction ().commit ();
            session.close ();
            return categoryList;
        } catch (Exception e)
        {
            System.out.println ( e.getMessage () );
        }
        return null;
    }
}
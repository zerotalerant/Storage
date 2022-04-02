package Dao;

import Entity.News;
import Model.NewsModel;
import Utills.HibernateUtills;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class NewsDao {

    //--------------------------------------------\\

    public Object createNewNews ( String newNews )
    {
        try
        {
            Session session = HibernateUtills.buildSessionFactory ().openSession ();
            session.beginTransaction ();
            session.save ( newNews );
            session.getTransaction ().commit ();
            session.close ();
        } catch (Exception e)
        {
            System.out.println ( e.getMessage () );
        }
        return null;
    }

    //--------------------------------------------\\

    public NewsModel showNewsByHeader ( String header )
    {
        NewsModel newsModel = new NewsModel ();
        try
        {
            Session session = HibernateUtills.buildSessionFactory ().openSession ();
            session.beginTransaction ();
            List<News> news = session.createQuery ( "from Entity.News where header =:header", News.class )
                    .setParameter ( "header", header ).list ();
            newsModel.setHeader ( news.get ( 0 ).getHeader () );
            newsModel.setNewsText ( news.get ( 0 ).getNewsText () );
            session.getTransaction ().commit ();
            session.close ();
        } catch (Exception e)
        {
            System.out.println ( e.getMessage () );
        }
        return null;
    }

    //--------------------------------------------\\

    public String deleteNewsById ( Long newsId )
    {
        try
        {
            Session session = HibernateUtills.buildSessionFactory ().openSession ();
            session.beginTransaction ();
            session.delete ( newsId );
            session.getTransaction ().commit ();
            session.close ();
        } catch (Exception e)
        {
            System.out.println ( e.getMessage () );
        }
        return null;
    }

    //--------------------------------------------\\

    public NewsModel changeNewsTextAndHeaderById ( Long id, NewsModel newsModel )
    {
        try
        {
            Session session = HibernateUtills.buildSessionFactory ().openSession ();
            session.beginTransaction ();
            News news = session.get ( News.class, id );
            news.setHeader ( newsModel.getHeader () );
            news.setNewsText ( newsModel.getNewsText () );
            session.update ( news );
            session.getTransaction ().commit ();
            session.close ();
        } catch (Exception e)
        {
            System.out.println ( e.getMessage () );
        }
        return null;
    }

    //--------------------------------------------\\

    public List<NewsModel> searchByText ( String text )
    {
        List<NewsModel> newsModels = new ArrayList<> ();
        try
        {
            Session session = HibernateUtills.buildSessionFactory ().openSession ();
            session.beginTransaction ();
            List<News> news = session.createQuery ( "SELECT header from Entity.News where header like :text ",
                    News.class ).setParameter ( "Какой-то нужный нам текст, который мы ищем", text ).list ();
            for (News searchingNews : news)
            {
                NewsModel newsModel = NewsModel.
                        builder ().
                        header ( searchingNews.getHeader () ).
                        newsText ( searchingNews.getNewsText () ).
                        build ();
                newsModels.add ( newsModel );
            }
            session.getTransaction ().commit ();
            session.close ();
        } catch (Exception e)
        {
            System.out.println ( e.getMessage () );
        }
        return null;
    }
}

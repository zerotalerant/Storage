package Application;

import Dao.NewsCategoryDao;
import Dao.NewsDao;
import Entity.News;
import Entity.NewsCategory;

public class Application {

    public static NewsCategoryDao newsCategoryDao = new NewsCategoryDao ();
    public static NewsDao newsDao = new NewsDao ();

    public static void main ( String[] args )
    {
        NewsCategory newsCategory = NewsCategory.
                builder ().newsCategory ( "Sport" ).build ();

        newsCategoryDao.addNewNewsCategory ( newsCategory );

        News news = News.
                builder ().
                header ( "Новости про спорт и только!" ).
                newsCategory ( "Sport" ).newsText ( "Бишкек проиграл в футбол Голотосараю!!!!!" ).
                build ();
        newsDao.createNewNews ( "Новая новость!" );
    }
}

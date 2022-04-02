package Model;

import lombok.Builder;

import java.sql.Time;

@Builder
public class NewsModel {

    private String header;
    private String newsText;
    private Time publishTime;

    public NewsModel ()
    {

    }

    public NewsModel ( String header, String newsText, Time publishTime )
    {
        this.header = header;
        this.newsText = newsText;
        this.publishTime = publishTime;
    }

    public String getHeader ()
    {
        return header;
    }

    public void setHeader ( String header )
    {
        this.header = header;
    }

    public String getNewsText ()
    {
        return newsText;
    }

    public void setNewsText ( String newsText )
    {
        this.newsText = newsText;
    }

    public Time getPublishTime ()
    {
        return publishTime;
    }

    public void setPublishTime ( Time publishTime )
    {
        this.publishTime = publishTime;
    }
}

package Model;

import lombok.Builder;

@Builder
public class NewsCategoryModel {
    private String newsName;

    public NewsCategoryModel ()
    {

    }

    public NewsCategoryModel ( String newsName )
    {
        this.newsName = newsName;
    }

    public String getNewsName ()
    {
        return newsName;
    }

    public void setNewsName ( String newsName )
    {
        this.newsName = newsName;
    }
}

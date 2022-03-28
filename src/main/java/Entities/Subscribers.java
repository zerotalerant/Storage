package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "subscribers")
public class Subscribers {
    @Id
    private Integer id;
    @Column(name = "subscribers_login")
    private String subscribersLogin;
    @Column(name = "subscribers_pass")
    private String subscribersPassword;
    @Column(name = "subscribers_id")
    private Integer subscribersId;
    @Column(name = "subscribe_date")
    private LocalDateTime subscribeDate;
    @Column(name = "counter_subscribers")
    private Integer subscribersCount;

    public Integer getId ()
    {
        return id;
    }

    public void setId ( Integer id )
    {
        this.id = id;
    }

    public String getSubscribersLogin ()
    {
        return subscribersLogin;
    }

    public void setSubscribersLogin ( String subscribersLogin )
    {
        this.subscribersLogin = subscribersLogin;
    }

    public String getSubscribersPassword ()
    {
        return subscribersPassword;
    }

    public void setSubscribersPassword ( String subscribersPassword )
    {
        this.subscribersPassword = subscribersPassword;
    }

    public Integer getSubscribersId ()
    {
        return subscribersId;
    }

    public void setSubscribersId ( Integer subscribersId )
    {
        this.subscribersId = subscribersId;
    }

    public LocalDateTime getSubscribeDate ()
    {
        return subscribeDate;
    }

    public void setSubscribeDate ( LocalDateTime subscribeDate )
    {
        this.subscribeDate = subscribeDate;
    }

    public Integer getSubscribersCount ()
    {
        return subscribersCount;
    }

    public void setSubscribersCount ( Integer subscribersCount )
    {
        this.subscribersCount = subscribersCount;
    }
}

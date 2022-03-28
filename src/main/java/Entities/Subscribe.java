package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "subscribe")
public class Subscribe {
    @Id
    private Integer id;
    @Column(name = "subscribe_id")
    private Integer subscribeId;
    @Column(name = "subscribe_date")
    private LocalDateTime subscribeDate;
    @Column(name = "counter_subscribe")
    private Integer subscribeCount;

    public Integer getId ()
    {
        return id;
    }

    public void setId ( Integer id )
    {
        this.id = id;
    }

    public Integer getSubscribeId ()
    {
        return subscribeId;
    }

    public void setSubscribeId ( Integer subscribeId )
    {
        this.subscribeId = subscribeId;
    }

    public LocalDateTime getSubscribeDate ()
    {
        return subscribeDate;
    }

    public void setSubscribeDate ( LocalDateTime subscribeDate )
    {
        this.subscribeDate = subscribeDate;
    }

    public Integer getSubscribeCount ()
    {
        return subscribeCount;
    }

    public void setSubscribeCount ( Integer subscribeCount )
    {
        this.subscribeCount = subscribeCount;
    }
}

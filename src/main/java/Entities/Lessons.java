package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lessons")
public class Lessons {
    @Id
    private Integer id;
    @Column(name = "lesson_id")
    private Integer lessonId;
    @Column(name = "lesson_category")
    private String lessonCategory;

    public Integer getId ()
    {
        return id;
    }

    public void setId ( Integer id )
    {
        this.id = id;
    }

    public Integer getLessonId ()
    {
        return lessonId;
    }

    public void setLessonId ( Integer lessonId )
    {
        this.lessonId = lessonId;
    }

    public String getLessonCategory ()
    {
        return lessonCategory;
    }

    public void setLessonCategory ( String lessonCategory )
    {
        this.lessonCategory = lessonCategory;
    }
}

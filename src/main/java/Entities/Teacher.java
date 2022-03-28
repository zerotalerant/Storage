package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher {
    @Id
    private Integer id;
    @Column(name = "teacher_id")
    private Integer teacherId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "second_name")
    private String secondName;
    @Column(name = "lesson")
    private String lesson;
    @Column(name = "telephone")
    private String telephone;

    public Integer getId ()
    {
        return id;
    }

    public void setId ( Integer id )
    {
        this.id = id;
    }

    public Integer getTeacherId ()
    {
        return teacherId;
    }

    public void setTeacherId ( Integer teacherId )
    {
        this.teacherId = teacherId;
    }

    public String getFirstName ()
    {
        return firstName;
    }

    public void setFirstName ( String firstName )
    {
        this.firstName = firstName;
    }

    public String getSecondName ()
    {
        return secondName;
    }

    public void setSecondName ( String secondName )
    {
        this.secondName = secondName;
    }

    public String getLesson ()
    {
        return lesson;
    }

    public void setLesson ( String lesson )
    {
        this.lesson = lesson;
    }

    public String getTelephone ()
    {
        return telephone;
    }

    public void setTelephone ( String telephone )
    {
        this.telephone = telephone;
    }
}

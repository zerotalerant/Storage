package Task_4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Objects;

public class Group {
    private String nameOfGroup;
    private int course;
    private int numberOfGroup;
    private ArrayList<Student> students;

    public Group ()
    {

    }

    public Group ( String nameOfGroup, int course, int numberOfGroup, ArrayList<Student> students )
    {
        this.nameOfGroup = nameOfGroup;
        this.course = course;
        this.numberOfGroup = numberOfGroup;
        this.students = students;
    }

    public String getNameOfGroup ()
    {
        return nameOfGroup;
    }

    public void setNameOfGroup ( String nameOfGroup )
    {
        this.nameOfGroup = nameOfGroup;
    }

    public int getCourse ()
    {
        return course;
    }

    public void setCourse ( int course )
    {
        this.course = course;
    }

    public int getNumberOfGroup ()
    {
        return numberOfGroup;
    }

    public void setNumberOfGroup ( int numberOfGroup )
    {
        this.numberOfGroup = numberOfGroup;
    }

    public ArrayList<Student> getStudents ()
    {
        return students;
    }

    public void setStudents ( ArrayList<Student> listOfStudents )
    {
        this.students = listOfStudents;
    }

    @Override
    public String toString ()
    {
        return "Информация о группе: " +
               "название группы: " + nameOfGroup +
               ", курс: " + course +
               ", номер группы: " + numberOfGroup +
               ", список студентов: " + students;
    }

    @Override
    public boolean equals ( Object o )
    {
        if ( this == o )
        {
            return true;
        }
        if ( o == null || getClass () != o.getClass () )
        {
            return false;
        }
        Group group = ( Group ) o;
        return course == group.course && numberOfGroup == group.numberOfGroup && Objects.equals ( nameOfGroup, group.nameOfGroup ) && Objects.equals ( students, group.students );
    }

    @Override
    public int hashCode ()
    {
        return Objects.hash ( nameOfGroup, course, numberOfGroup, students );

    }

}

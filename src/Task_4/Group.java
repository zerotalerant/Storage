package Task_4;

import java.util.ArrayList;
import java.util.Objects;

public class Group {
    public String nameOfGroup;
    public int cours;
    public int numberOfGroup;
    public ArrayList<Student> listOfStudents;

    public Group ()
    {

    }

    public Group ( String nameOfGroup, int cours, int numberOfGroup, ArrayList<Student> listOfStudents )
    {
        this.nameOfGroup = nameOfGroup;
        this.cours = cours;
        this.numberOfGroup = numberOfGroup;
        this.listOfStudents = listOfStudents;
    }

    public String getNameOfGroup ()
    {
        return nameOfGroup;
    }

    public void setNameOfGroup ( String nameOfGroup )
    {
        this.nameOfGroup = nameOfGroup;
    }

    public int getCours ()
    {
        return cours;
    }

    public void setCours ( int cours )
    {
        this.cours = cours;
    }

    public int getNumberOfGroup ()
    {
        return numberOfGroup;
    }

    public void setNumberOfGroup ( int numberOfGroup )
    {
        this.numberOfGroup = numberOfGroup;
    }

    public ArrayList<Student> getListOfStudents ()
    {
        return listOfStudents;
    }

    public void setListOfStudents ( ArrayList<Student> listOfStudents )
    {
        this.listOfStudents = listOfStudents;
    }

    @Override
    public String toString ()
    {
        return "Группа: " +
               "название группы: " + nameOfGroup +
               ", курс: " + cours +
               ", номер группы: " + numberOfGroup +
               ", список студентов: " + listOfStudents;
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
        return cours == group.cours && numberOfGroup == group.numberOfGroup && Objects.equals ( nameOfGroup, group.nameOfGroup ) && Objects.equals ( listOfStudents, group.listOfStudents );
    }

    @Override
    public int hashCode ()
    {
        return Objects.hash ( nameOfGroup, cours, numberOfGroup, listOfStudents );
    }
}

package Task_4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Student {
    private int pin;
    private String name;
    private List<Integer> marks;

    public Student ()
    {

    }

    public Student ( int pin, String name, int marks )
    {
        this.pin = pin;
        this.name = name;
        this.marks = Collections.singletonList ( marks );
    }

    public int getPin ()
    {
        return pin;
    }

    public void setPin ( int pin )
    {
        this.pin = pin;
    }

    public String getName ()
    {
        return name;
    }

    public void setName ( String name )
    {
        this.name = name;
    }

    public List<Integer> getMarks ()
    {
        return marks;
    }

    public void setMarks ( List<Integer> marks )
    {
        this.marks = marks;
    }
    @Override
    public String toString ()
    {
        return "Студент: " +
               "пин: " + pin +
               ", имя: " + name +
               ", оценки: " + marks;
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
        Student student = ( Student ) o;
        return pin == student.pin && Objects.equals ( name, student.name ) && Objects.equals ( marks, student.marks );
    }

    @Override
    public int hashCode ()
    {
        return Objects.hash ( pin, name, marks );
    }

    public int avg ()
    {
        int avg = 0;
        for (int i = 0; i < marks.size (); i++)
        {
            avg = avg + ( marks.get ( i ) / marks.size () );
        }
        return avg;
    }
}

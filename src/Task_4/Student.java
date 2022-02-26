package Task_4;

import java.util.Objects;

public class Student {
    public int pin;
    public String name;
    public int marks;

    public Student ()
    {

    }

    public Student ( int pin, String name, int marks )
    {
        this.pin = pin;
        this.name = name;
        this.marks = marks;
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

    public int getMarks ()
    {
        return marks;
    }

    public void setMarks ( int marks )
    {
        this.marks = marks;
    }

    @Override
    public String toString ()
    {
        return "Студент: " +
               "пин" + pin +
               ", имя" + name +
               ", оценка" + marks;
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
        return pin == student.pin && marks == student.marks && Objects.equals ( name, student.name );
    }

    @Override
    public int hashCode ()
    {
        return Objects.hash ( pin, name, marks );
    }
}

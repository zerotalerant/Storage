package Task_4;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main ( String[] args )
    {
        ArrayList<Group> groups = new ArrayList<> ();
        ArrayList<Student> students = new ArrayList<> ();
        ArrayList<Student> studentsDeduction = new ArrayList<> ();

        Group group = new Group ();

        Student student1 = new Student ();
        student1.setName ( "Sasha" );
        student1.setPin ( 228 );
        student1.setMarks ( new ArrayList<> () );
        student1.getMarks ().add ( 23 );
        student1.getMarks ().add ( 61 );
        student1.getMarks ().add ( 84 );

        Student student2 = new Student ();
        student2.setName ( "Michael" );
        student2.setPin ( 337 );
        student2.setMarks ( new ArrayList<> () );
        student2.getMarks ().add ( 76 );
        student2.getMarks ().add ( 63 );
        student2.getMarks ().add ( 24 );

        Student student3 = new Student ();
        student3.setName ( "Obeme" );
        student3.setPin ( 488 );
        student3.setMarks ( new ArrayList<> () );
        student3.getMarks ().add ( 98 );
        student3.getMarks ().add ( 75 );
        student3.getMarks ().add ( 64 );

        group.setNameOfGroup ( "JAVA-F21" );
        group.setCourse ( 1 );
        group.setNumberOfGroup ( 1 );
        group.setStudents ( new ArrayList<> () );
        group.getStudents ().add ( student1 );
        group.getStudents ().add ( student2 );

        students.add ( student1 );
        students.add ( student2 );
        groups.add ( group );
        System.out.println ( groups );
        System.out.println ( "-----------------------------------------------------" );

        for (Group value : groups)
        {
            if ( value.getNumberOfGroup () == 1 )
            {
                group.getStudents ().add ( student3 );
            }
        }
        System.out.println ( groups );
        System.out.println ( "--------------------------------------------------------" );

        for (Group value : groups)
        {
            if ( value.getNumberOfGroup () == 1 && group.getStudents ().contains ( student2 ) )
            {
                value.getStudents ().remove ( student2 );

            }
        }
        System.out.println ( groups );
        System.out.println ( "----------------------------------------------------------" );

        int i = 0;
        while (i < groups.size ())
        {
            int course = groups.get ( i ).getCourse ();
            groups.get ( i ).setCourse ( course + 1 );
            if ( students.get ( i ).avg () < 61 )
            {
                groups.get ( i ).getStudents ().remove ( students.get ( i ) );
                studentsDeduction.add ( students.get ( i ) );
            }
            i++;
        }

        File file = new File ( "C:\\Program Files\\Java\\file.txt" );
        try
        {
            FileWriter fileWriter = new FileWriter ( file );
            fileWriter.write ( String.valueOf ( studentsDeduction ) );
            fileWriter.close ();
            FileReader fileReader = new FileReader ( file );
            fileReader.close ();
        } catch (IOException e)
        {
            e.printStackTrace ();
        }

        int j = 0;
        int avg = 0;
        while (j < groups.size ())
        {
            avg = 0;
            avg = avg + ( students.get ( j ).avg () / students.size () );
            j++;
        }

        System.out.println ( groups );
        System.out.println ( "---------------------------------------------------" );
        System.out.println ( studentsDeduction );
        System.out.println ( "---------------------------------------------------" );
        System.out.println ("Средний балл группы: " + avg );
    }
}

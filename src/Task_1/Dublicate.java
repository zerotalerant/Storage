package Task_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Dublicate {
    public Set<Character> numbers ()
    {
        Scanner scanner = new Scanner ( System.in );

        System.out.print ( "Введите набор чисел: " );

        String count = scanner.next ();

        Set<Character> setOfNumbers = new HashSet<> ();

        count = count.toLowerCase ();

        for (int i = 0; i < count.length (); i++)
        {
            if ( count.charAt ( i ) == ',' )
            {
                continue;
            }
            setOfNumbers.add ( count.charAt ( i ) );
        }
        return setOfNumbers;
    }
}


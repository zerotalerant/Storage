package Task_3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main ( String[] args )
    {
        Map<typeOfAnimal, List<Pet>> map = new HashMap<> ();
        map.put ( typeOfAnimal.Cat, List.of ( new Cat ( "Madina" ) ) );
        map.put ( typeOfAnimal.Dog, List.of ( new Dog ( "Abobus" ) ) );
        map.put ( typeOfAnimal.Parrot, List.of ( new Parrot ( "Bogdan" ) ) );

        System.out.println (map);
        System.out.println (map.keySet ());
    }
}

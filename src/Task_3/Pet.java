package Task_3;

public class Pet {
    public String name;

    public Pet ( String name )
    {
        this.name = name;
    }

    public String getName ()
    {
        return name;
    }

    public void setName ( String name )
    {
        this.name = name;
    }

    @Override
    public String toString ()
    {
        return "Животное: " +
               "имя: " + name;
    }
}

package Task_2;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main {
    public static void main ( String[] args )
    {
        ArrayList<Order> orders = new ArrayList<> ();

        Product product1 = new Product ();
        Order order1 = new Order ();

        order1.setNumberOfOrder ( 1 );
        order1.setDateOfOrders ( LocalDate.now () );
        order1.setTimeOfOrders ( LocalTime.now () );
        product1.setNameOfProduct ( "Cheese" );
        product1.setTypeOfProduct ( typeOfProduct.Milk );
        order1.setProducts ( new ArrayList<> () );
        order1.getProducts ().add ( product1 );

        orders.add ( order1 );
        System.out.println ( order1 );

        Product product2 = new Product ();
        Order order2 = new Order ();

        order2.setNumberOfOrder ( 2 );
        order2.setDateOfOrders ( LocalDate.now () );
        order2.setTimeOfOrders ( LocalTime.now () );
        product2.setNameOfProduct ( "Carrot" );
        product2.getTypeOfProduct ( typeOfProduct.Vegetables );
        order2.setProducts ( new ArrayList<> () );
        order2.getProducts ().add ( product2 );

        orders.add ( order2 );
        System.out.println ( order2 );

        orders.remove ( order2 );
        System.out.println ( "-----------------------------------------------" );
        System.out.println ( orders );
        System.out.println ( "-----------------------------------------------" );

        for (int i = 0; i < orders.size (); i++)
        {
            if ( orders.contains ( order1 ) )
            {
                System.out.println ( orders.get ( i ) );
            }
        }
    }
}

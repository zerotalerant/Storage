package Task_2;

import java.util.ArrayList;

public class OrdersManagment implements Managment {
    private ArrayList<Order> orders;

    public OrdersManagment ()
    {

    }

    public OrdersManagment ( ArrayList<Order> orders )
    {
        this.orders = orders;
    }

    @Override
    public void addOrder ( Order orderOfProduct )
    {
        orders.add ( orderOfProduct );
    }

    @Override
    public void deleteOrder ( Order orderOfProduct )
    {
        boolean check = true;
        for (Order order1 : orders)
        {
            if ( orderOfProduct.equals (order1) )
            {
                orders.remove ( orderOfProduct);
                check = false;
                System.out.println ( "Ваш заказ успешно удалён." );
                return;
            }
        }
    }

    @Override
    public void searchForOrder ( int numberOfOrder )
    {
        boolean check1 = true;
        for (Order order : orders)
        {
            if ( order.getNumberOfOrder () == numberOfOrder )
            {
                System.out.println ( order );
                check1 = false;
            }

        }
        if ( check1 )
        {
            System.out.println ( "Такого заказа не существует." );
        }
    }

    public ArrayList<Order> getOrders ()
    {
        return orders;
    }

    public void setOrders ( ArrayList<Order> orders )
    {
        this.orders = orders;
    }

    @Override
    public String toString ()
    {
        return "Управление заказами: " + " заказы: " + orders;
    }

}

package Task_2;

import java.util.Objects;

public class Product {
    private String nameOfProduct;
    private typeOfProduct typeOfProduct;

    public Product ()
    {
    }

    public Product ( String nameOfProduct, typeOfProduct typeOfProduct )
    {
        this.nameOfProduct = nameOfProduct;
        this.typeOfProduct = typeOfProduct;
    }

    public String getNameOfProduct ()
    {
        return nameOfProduct;
    }

    public void setNameOfProduct ( String nameOfProduct )
    {
        this.nameOfProduct = nameOfProduct;
    }

    public typeOfProduct getTypeOfProduct ()
    {
        return typeOfProduct;
    }

    public void setTypeOfProduct ( typeOfProduct typeOfProduct )
    {
        this.typeOfProduct = typeOfProduct;
    }


    @Override
    public String toString ()
    {
        return "Продукты: " +
               "название продукта: " + nameOfProduct +
               ", вид продукта: " + typeOfProduct;
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
        Product product = ( Product ) o;
        return Objects.equals ( nameOfProduct, product.nameOfProduct ) && typeOfProduct == product.typeOfProduct;
    }

    @Override
    public int hashCode ()
    {
        return Objects.hash ( nameOfProduct, typeOfProduct );
    }
}

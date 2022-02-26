package Task_2;

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

    public typeOfProduct getTypeOfProduct () { return  typeOfProduct; }

    public void setNameOfProduct ( String nameOfProduct )
    {
        this.nameOfProduct = nameOfProduct;
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

    public void getTypeOfProduct ( Task_2.typeOfProduct typeOfProduct)
    {
    }
}

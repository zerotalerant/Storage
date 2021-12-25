package com.company;

public class Pizza {

    public int price;
    public double weight;
    public String bake;
    public String delivery;

    public Pizza(int price, int weight, String make, String delivery) {
        this.price = price;
        this.weight = weight;
        this.bake = make;
        this.delivery = delivery;
    }

    public Pizza() {

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "price=" + price +
                ", weight=" + weight +
                ", bake='" + bake + '\'' +
                ", delivery='" + delivery + '\'' +
                '}';
    }

    public void bakePizza() {
        System.out.println("Приготовить пиццу");
    }

    public void deliveryPizza() {
        System.out.println("Доставить пиццу");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBake() {
        return bake;
    }

    public void setBake(String make) {
        this.bake = make;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }
}

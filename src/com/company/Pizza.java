package com.company;

public class Pizza {

    public String price;
    public String weight;
    public String make;
    public String delivery;

    public Pizza(String price, String weight, String make, String delivery) {
        this.price = price;
        this.weight = weight;
        this.make = make;
        this.delivery = delivery;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }
}

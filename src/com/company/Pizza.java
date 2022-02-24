package com.company;

public class Pizza {
    private int price;
    private double weight;
    private String bake;
    private boolean delivery;


    public Pizza() {
    }

    public Pizza(int price, double weight) {
        this.price = price;
        this.weight = weight;
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

    public String canBake() {
        return bake;
    }

    public void setBake(String bake) {
        this.bake = bake;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }
}

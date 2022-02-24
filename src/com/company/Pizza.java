package com.company;

public class Pizza {
    private int price;
    private double weight;
    private String bake;


    public Pizza() {
    }

    public Pizza(int price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public static void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public static void setWeight(double weight) {
        this.weight = weight;
    }

    public String canBake() {
        return bake;
    }

    public static void setBake(String bake) {
        this.bake = bake;
    }


}

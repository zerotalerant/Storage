package com.company;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.setPrice(490);
        pizza.setWeight(1.200);
        pizza.setBake("Готовится будет 20 минут");
        pizza.setDelivery("Доставка будет в течении часа");

        pizza.bakePizza();
        pizza.deliveryPizza();


    }
}

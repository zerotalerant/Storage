package com.company;

import java.util.Scanner;

public class Etiketka {
    Scanner scanner = new Scanner(System.in);
    private Margaritta[] margaritta;
    private LaFinta[] laFinta;
    private Peperoni[] peperoni;

    public void setMargarita(Margaritta margaritta) {
        this.margaritta = new Margaritta[5];
        for (int i = 0; i < this.margaritta.length; i++) {
            if (this.margaritta[i] == null) {
                this.margaritta[i] = margaritta;
                break;
            }
        }
        System.out.println("С мясом или нет?");
        String withMeatOrNot = scanner.next();

        if (withMeatOrNot.equals("Нет") || withMeatOrNot.equals("Да")) {
            margaritta.setWithMeatOrNot(true);
        } else {
            margaritta.setWithMeatOrNot(false);
        }
        System.out.println(" Готовка ");
        String order = scanner.next();
        boolean cook = true;
        while (cook) {

            if (order.equals("Статус заказа?")) {

                System.out.println("Ваш заказ будет скоро готов");
                margaritta.setBake("Готовится");
                cook = false;
            }
            System.out.println(margaritta);
        }

        public void setLaFinta (LaFinta laFinta){
            this.laFinta = new LaFinta[5];
            for (int i = 0; i < this.laFinta.length; i++) {
                if (this.laFinta[i] == null) {
                    this.laFinta[i] = laFinta;
                    break;
                }
            }
            System.out.print("С грибами или без");
            String withMeatOrNot2 = scanner.next();
            if (withMeatOrNot2.equals("Без") || withMeatOrNot2.equals("С ")) {
                LaFinta.setWithMushrooms(true);
            } else {
                LaFinta.setWithMushrooms(false);
            }

            System.out.println("Готовка ");
            boolean price = true;
            String order2 = scanner.next();

            boolean cook2 = true;
            while (cook2) {

                if (order2.equals("Статус заказа?")) {

                    System.out.println("Ваш заказ скоро будет готов!");
                    LaFinta.setBake("Готовится");
                    cook2 = false;
                    System.out.println(LaFinta);
                }

                public void setPeperoni (Peperoni peperoni){
                    this.peperoni = new Peperoni[5];
                    for (int i = 0; i < this.peperoni.length; i++) {
                        if (this.peperoni[i] == null) {
                            this.peperoni[i] = peperoni;
                            break;
                        }
                    }
                    System.out.print("Острая или нет?");
                    String withMeatOrNot3 = scanner.next();
                    if (withMeatOrNot3.equals("Да") || withMeatOrNot3.equals("Нет")) {
                        peperoni.setSpicy(true);
                    } else {
                        peperoni.setSpicy(false);
                    }
                    System.out.println(" Готовка ");
                    String order3 = scanner.next();

                    boolean cook3 = true;
                    while (cook3) {

                        if (order3.equals("Cтатус заказа?")) {

                            System.out.println("Ваш заказ скоро будет готов!");
                            peperoni.setBake("Готовится");
                            cook3 = false;
                        }
                    }
                    System.out.println(peperoni);
                }
            }
        }

    }
}
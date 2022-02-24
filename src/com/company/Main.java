package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int point;
        do {
            System.out.println(
                    "                  Меню\n" +
                            "             1 . Margaritta\n" +
                            "             2 . LaFinta\n" +
                            "             3 . Peperoni\n" +
                            "             0 . Завершить заказ\n");

            point = scanner.nextInt();
            switch (point) {
                case 1:
                    Peperoni peperoni = new Peperoni();
                    Etiketka.setPeperoni(peperoni);
                    break;
                case 2:
                    Margaritta magarita = new Margaritta();
                    Etiketka.setMargaritta(magarita);
                    break;
                case 3:
                    LaFinta laFinta = new LaFinta();
                    Etiketka.setLaFinta(laFinta);
                    break;
                case 0:
                    break;
            }
        } while (point != 0);
    }
}

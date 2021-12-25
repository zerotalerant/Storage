package com.company;

import java.util.ArrayList;
import java.util.List;

public class Peperoni extends Pizza {
    public static void main(String[] args) {

        public static List<String> getPeperoni (int spicy) {
            List<String> result = new ArrayList<>();
            switch (spicy) {
                case 1:
                    System.out.println("Острая");
                    break;
                case 2:
                    System.out.println("Не острая");
                default:
                    break;
            }
        }
    }
}
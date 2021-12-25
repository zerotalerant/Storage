package com.company;

import java.util.ArrayList;
import java.util.List;

public class LaFinta extends Pizza {
    public static void main(String[] args) {
        public static List<String> getLaFinta (int mushrooms) {
            List<String> result = new ArrayList<>();
            switch (mushrooms) {
                case 1:
                    System.out.println("С грибами");
                    break;
                case 2:
                    System.out.println("Без грибов");
                default:
                    break;
            }
        }
    }

}

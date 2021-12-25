package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите радиус: ");
        double radius = scan.nextDouble();
        int[] circle = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < circle.length; i++) {
            if (circle[i] % 3 == 0) {
                System.out.println(circle[i]);
            }
        }
        System.out.println(Arrays.toString(circle));
  //     System.out.println("Area: " + circle.getSquare());
//      System.out.println("Length: " + circle.getNumberOfCircles());
    }
}

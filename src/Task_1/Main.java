package Task_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите набор чисел: ");
        Set<Character> set = new HashSet<>();
        String numbers = scanner.next();


        for (int i = 0; i < numbers.length(); i++) {
            if (numbers.charAt(i) == ',') {
                continue;
            }
            set.add(numbers.charAt(i));
        }
        System.out.println(set);
    }
}
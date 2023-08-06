package Homework2.task004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex0();
    }

    private static void ex0() {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                System.out.println("Введите значение: ");
                String val = scanner.nextLine();
                if (val.isEmpty()) {
                    throw new Exception("Пустые строки вводить нельзя!");
                } else {
                    System.out.println("Введенное значение: " + val);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

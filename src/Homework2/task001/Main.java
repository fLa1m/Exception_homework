package Homework2.task001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        do {
            try {
                ex0();
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("Не верный тип данных");
            }
        } while (flag);

    }

    private static void ex0() throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение: ");
        String val = scanner.nextLine();
        float result = Float.parseFloat(val);
        scanner.close();
        System.out.println("Введенное значение: " + result);
    }

}

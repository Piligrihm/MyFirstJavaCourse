package HomeWork2;

import java.util.Scanner;

public class Task1Main3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите желаемое число - ");

        double num1 = 0;
        int num1int = 0;
        int num2 = 0;

        // является ли целым числом
        if (scanner.hasNextInt()) {
            num1int = scanner.nextInt();
            num1 = (double) num1int;

        // является ли числом с плавающей запятой
        } else if (scanner.hasNextDouble()) {
            num1 = scanner.nextDouble();


        } else {
            System.out.println("Вы ввели недопустимое значение. Порпобуйте еще раз");
            scanner.next();

        }
        System.out.println("Введите степень - ");

        if (scanner.hasNextInt()) {
            num2 = scanner.nextInt();

            if (num2 < 0) {
                System.out.println("Вы ввели недопустимое значение. Порпобуйте еще раз");
                scanner.next();
            }
        } else {
            System.out.println("Вы ввели недопустимое значение. Порпобуйте еще раз");
            scanner.next();
        }
        // возводим в степень
        double res = 1;
        for (int i = 0; i < num2; i++) {
            res *= num1;

        }
        System.out.println("num " + res);

    }

}

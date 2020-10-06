package HomeWork2;

import java.util.Scanner;

public class Task2Main3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите желаемый размер массива");

        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Необходимо наполнить массив. Введите новое значение - ");


        for (int i = 0; i < arr.length; i++) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                arr[i] = number;


            } else {
                System.out.println("Вы ввели недопустимое значение. Порпобуйте еще раз");
                scanner.next();
                i--;
            }
        }
        scanner.close();


        // Выводим элементы массива, используя цикл do.......while

        System.out.println("\nВыводим элементы массива, используя цикл do.....while\n");
        int x = arr.length - 1;
        do {
            System.out.println(arr[x]);
            x--;

        } while (x >= 0);


        // Выводим элементы массива, используя цикл while

        System.out.println("\nВыводим элементы массива, используя цикл while\n");
        int j = arr.length - 1;
        while (j >= 0) {
            System.out.println(arr[j]);
            j--;

        }


        // Выводим элементы массива, используя цикл for

        System.out.println("\nВыводим элементы массива, используя цикл for\n");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);

        }

        // Выводим элементы массива, используя цикл foreach

        for (int i = 0; i < arr.length; i++) {
            for (int count = 0; count < arr.length - 1; count++) {
                /*// объявляем временную переменную, которая хранит последний
                (из двух меняемых местами эелементов массива) и присваваем ей значение второго*/
                // таким образом меняем местами значение массива (инверсия)

                int hold = arr[(arr.length - 1)];
                arr[arr.length - 1] = arr[i];
                arr[i] = hold;
            }
        }
        System.out.println("\nВыводим элементы массива, используя цикл foreach\n");

        for (int element : arr) {
            System.out.println(element);
        }


    }
}

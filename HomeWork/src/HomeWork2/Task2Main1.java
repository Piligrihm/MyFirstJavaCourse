package HomeWork2;

import java.util.Random;

public class Task2Main1 {
    public static void main(String[] args) {

        /* Создаем массив определенной длины и наполняем его случайными числами */
        int[] arr = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt();
        }

        // Выводим элементы массива, используя цикл do.......while
        
        System.out.println("\nВыводим элементы массива, используя цикл do.....while\n");
        int x = 0;
        do {
            System.out.println(arr[x]);
            x++;

        } while (x != arr.length);


        // Выводим элементы массива, используя цикл while

        System.out.println("\nВыводим элементы массива, используя цикл while\n");
        int j = 0;
        while (j != arr.length) {
            System.out.println(arr[j]);
            j++;
        }


        // Выводим элементы массива, используя цикл for

        System.out.println("\nВыводим элементы массива, используя цикл for\n");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        // Выводим элементы массива, используя цикл foreach

        System.out.println("\nВыводим элементы массива, используя цикл foreach\n");

        for (int element : arr) {
            System.out.println(element);
        }


    }
}


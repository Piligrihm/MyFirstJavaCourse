package HomeWork2;

import java.util.Random;

public class Task2Main2 {
    public static void main(String[] args) {

        /* Создаем массив определенной длины и наполняем его случайными числами */

        int[] arr = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt();
        }

        System.out.println("\nКаждый второй элемент массива:\n");
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % 2 == 0) {
                System.out.println("Индекс нужного элемента массива - " + i + ". Значение - " + arr[i]);

            }


        }
    }
}

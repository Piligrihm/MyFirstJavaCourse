package HomeWork2;

import java.util.Random;

public class Task4Main3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int length = 0; // переменная для размера массива

        /*
        цикл, который присваивает перменной случайное значение и проверяет является ли число положительным
         */
        do {
            int tempVar = rnd.nextInt();
            length = tempVar;
        } while (length < 0);


        System.out.println(length);

        // создание массива произвольной длины
        int[] arr = new int[length];

        //заполнение массива произвольными значениями
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt();
        }
    }
}

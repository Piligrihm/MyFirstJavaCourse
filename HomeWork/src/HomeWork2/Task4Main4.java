package HomeWork2;

import java.util.Arrays;
import java.util.Scanner;

public class Task4Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите необходимую длину массива...");
        int length = scanner.nextInt();

        int[] arr = new int[length];
        System.out.println("Давайте наполним массив. Для этого нам нужно ввести - " + length + " чисел. " +
                "Введите число..");

        for (int i = 0; i < length; i++) {
            // проверяем, является ли введенное значение типа int
            if (scanner.hasNextInt()) {
                int tempVar = scanner.nextInt();
                arr[i] = tempVar;
            } else {
                System.out.println("Введено недопустимое значение. Веедите снова...");
                i--;
                scanner.next();
            }

        }
        System.out.println("Наш массив - " + Arrays.toString(arr));
    }
}

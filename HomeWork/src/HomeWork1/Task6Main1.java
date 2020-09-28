package HomeWork1;

import java.util.Arrays;

public class Task6Main1 {
    public static void main(String[] args) {

        createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
    }

    public static String createPhoneNumber(int[] numbers) {

        String result = "(";

        // Цикл перебирает все эллементы массива и выводит ште в строковой оболочке

        for (int i = 0; i < numbers.length; i++) {

            String res = String.valueOf(numbers[i]);
            result = result + res;

            if (i == 2) {
                result = result + ") ";
            }
            if (i == 5) {
                result = result + "-";

            }

        }

        System.out.println(result);

        return result;
    }
}

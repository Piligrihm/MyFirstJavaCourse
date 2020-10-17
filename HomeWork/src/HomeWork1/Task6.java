package HomeWork1;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

        createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});

        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0})); //вывод отформатированного результата

    }

    public static String createPhoneNumber(int[] numbers) {

        // Создаем строку из массива целых чисел. Затем убираем пробелы, запятые и ковычки

        String numberFromArray = Arrays.toString(numbers).replaceAll("\\[|\\]|,| ", "");

        // Добавляем скобки и тире в нужных местах. Фактически сотавляю новую строку из нужных символов и кусочков старой строки

        String result = "(" + numberFromArray.substring(0, 3) + ") " + numberFromArray.substring(3, 6) + "-" + numberFromArray.substring(6, 10);

        return result;
    }
}

package HomeWork1;

import java.util.Scanner;

public class Task5Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String name = scanner.nextLine();

        switch (name) {
            case "Вася":
                System.out.println("Привет, " + name + "!" + "\nЯ тебя так долго ждал!");
                break;
            case "Анастасия":
                System.out.println(name + ", " + "Я тебя так долго ждал!");
                break;
            default:
                System.out.println("Добрый день, " + name + "." + "\nВы кто?");

        }
    }
}

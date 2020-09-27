package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class Task5Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String name = scanner.nextLine();

        String friendName = "Вася";
        String girlfriendName = "Аанстасия";

        boolean isFriend = Objects.equals(friendName, name);
        boolean isGirlFriend = Objects.equals(girlfriendName, name);


        if (isFriend) {

            System.out.println("Привет, " + name + "!" + "\nЯ тебя так долго ждал!");
        }
        if (isGirlFriend) {
            System.out.println(name + ", " + "Я тебя так долго ждал!");
        }

        if (!isFriend & !isGirlFriend) {
            System.out.println("Добрый день, " + name + "." + "\nВы кто?");
        }
    }
}

package HomeWork1;

public class Task2 {
    public static void main(String[] args) {

        int a = 2;
        int b = 8;
        int exercize2_1;
        int exercize2_2;
        int exercize2_3;
        int exercize2_4;
        int exercize2_5;
        int exercize2_6;
        int exercize2_7;
        Boolean exercize2_8;
        Boolean exercize2_9;


        exercize2_1 = 5 + 2 / 8;

        //System.out.println("Ex2.1 result = " + exercize2_1);

        /*
        результат = 5
        все три значения int, значит и результат int
        сначала выполнится деление, а затем сложение.
        (5 + 0,25) = 5,25 => 5
        */

        exercize2_2 = (5 + 2) / 8;

        /*
        результат = 0
        все три значения int, значит и результат int
        сначала выполняется действие в скобках, затем деление
        7 / 8 = 0,875 => 0
        */

        exercize2_3 = (5 + a++) / 8;

        /*
        результат = 0
        сначала a++ (2), потом скобки, затем деление
        (5 + 2) / 8 = 0,875 => 0
        */

        exercize2_4 = (5 + a++) / --b;
        a = 2;
        b = 8;

        /*
        результат = 1
        сначала a++ (2), потом скобки, затем --b = 7, а потом деление
        (5 + 2) / 7 = 1
         */

        exercize2_5 = (5 * 2 >> a++) / --b;
        a = 2;
        b = 8;

        /*
        результат = 0
        5 * 2 = 10 (1010 - в двоичной системе).
        10 >> 2 => (1010 >> 2 => 10 (в двоичной)) => 2 (в десятичной)
        2 / 7 = 0,285 => 0
         */

        exercize2_6 = (5 + 7 > 20 ? 68 : 22 * 2 >> a++) / --b;
        a = 2;
        b = 8;

        /*
        результат = 1
        в левой части 5 + 7 > 20 (false) => выполняем вторую часть
        44 (101100 - BIN) >> 2 => 1011 (BIN) => 11 (int)
        11 / 7 = 1.75 => 1
         */

        //exercize2_7 = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> a++) / --b; //System.out.println((); // ошибка компиляции

        exercize2_8 = 6 - 2 > 3 && 12 * 12 <= 119;

        /*
        результат = false
        6 - 2 > 3 (true)
        12 * 12 <= 119 (false)
        При логическом "И" - true, если оба операнда true либо оба false => наш случай - false
         */

        exercize2_9 = true && false; // равнозначно предыдущему => false

        System.out.println("\tЗадание 2.1 \nРезультат = " + exercize2_1
                + "\n\tЗадание 2.2 \nРезультат = " + exercize2_2
                + "\n\tЗадание 2.3 \nРезультат = " + exercize2_3
                + "\n\tЗадание 2.4 \nРезультат = " + exercize2_4
                + "\n\tЗадание 2.5 \nРезультат = " + exercize2_5
                + "\n\tЗадание 2.6 \nРезультат = " + exercize2_6
                + "\n\tЗадание 2.7 \nРезультат = ошибка компиляции"
                + "\n\tЗадание 2.8 \nРезультат = " + exercize2_8
                + "\n\tЗадание 2.9 \nРезультат = " + exercize2_9);


    }
}

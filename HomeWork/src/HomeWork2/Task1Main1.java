package HomeWork2;

public class Task1Main1 {
    public static void main(String[] args) {

       // System.out.println(args[0]); // Вывод в консоль введенного аргумента (String)

        int progArg = Integer.parseInt(args[0]); // Перевод строкового параметра в целочисленный

        //System.out.println(progArg); // Вывод в консоль результата (int)

        int i = 1;
        String c = "";

        for (int a = 1; a <= progArg; a++) {
            i *= a;
            String d = " * ";
            if (a == 5) {
                d = " = ";
            }
            String b = String.valueOf(a) + d;
            c = c + b;

        }

        System.out.println(c + i); // Вывод результата в формате 1 * 2 * 3 * 4 * 5 = результат вычислений

    }
}

package HomeWork1;

public class Task1 {
    public static void main(String[] args) {
        int positiveA = 42;
        int positiveB = 15;
        int negativeA = -42;
        int negativeB = -15;
        double doubVar = 42.5;

        // Переводим переменные в двоичный код и ограничиваем кол-во символов до 8-ми

        String convert1 = Integer.toBinaryString(positiveA + 0b100000000).substring(1);
        String convert2 = Integer.toBinaryString(positiveB + 0b100000000).substring(1);

        // Справедливо для двузначных отрицательных чисел

        String convert3 = Integer.toBinaryString(negativeA);

        String strValue3;
        int value3 = convert3.length();
        strValue3 = convert3.substring(value3 - 8);

        String convert4 = Integer.toBinaryString(negativeB);

        String strValue4;
        int value4 = convert4.length();
        strValue4 = convert4.substring(value4 - 8);


        System.out.println("Число 42 в двоичной системе " + convert1);
        System.out.println("Число 15 в двоичной системе " + convert2);
        System.out.println("Число -42 в двоичной системе " + strValue3);
        System.out.println("Число -15 в двоичной системе " + strValue4);

        // double в двоичный код

        double d = 42.5;
        String sResult = "";
        long numberBits = Double.doubleToLongBits(d);
        System.out.println("qqqqqqqqqqqqqqqqqqqqqq    "+ numberBits );

        sResult = Long.toBinaryString(numberBits);
        System.out.println("\nПредставление вещественного числа в формате чисел с плавающей точкой");

        System.out.format("Число: %5.2f\n", d);
        System.out.println("Формат чисел с плавающей точкой:");

        //ведущий ноль заботливо сокращен системой, поэтому его нужно восстановить

        System.out.println(d > 0 ? "0" + sResult : sResult);


        int pozRezult1 = positiveA |= positiveB;

        negativeA = -42;
        negativeB = -15;

        int negRezult1 = negativeA |= negativeB;

        positiveA = 42;
        positiveB = 15;

        int pozRezult2 = positiveA &= positiveB;

        negativeA = -42;
        negativeB = -15;

        int negRezult2 = negativeA &= negativeB;

        positiveA = 42;
        positiveB = 15;

        int pozRezult3 = positiveA ^= positiveB;

        negativeA = -42;
        negativeB = -15;

        int negRezult3 = negativeA ^= negativeB;

        positiveA = 42;
        positiveB = 15;

        int pozRezult4 = positiveA <<= positiveB;

        negativeA = -42;
        negativeB = -15;

        int negRezult4 = negativeA <<= negativeB;

        positiveA = 42;
        positiveB = 15;

        int pozRezult5 = positiveA >>= positiveB;

        negativeA = -42;
        negativeB = -15;

        int negRezult5 = negativeA >>= negativeB;

        positiveA = 42;
        positiveB = 15;

        int pozRezult6 = positiveA >>>= positiveB;

        negativeA = -42;
        negativeB = -15;

        int negRezult6 = negativeA >>>= negativeB;


        // 1.2 Все возможные побитовые операции с числами 42 и 15

        // Операция OR (|)

        System.out.println("\n\tОперация OR (|)");
        System.out.println("42 | 15 = " + (positiveA | positiveB)); // 47 в двоичной системе 00101111
        System.out.println("-42 << -15 = " + (negativeA | negativeB)); // -9 в двочиной системе 11110111

        // Операция AND (&)

        System.out.println("\n\tОперация AND (&)");
        System.out.println("42 & 15 = " + (positiveA & positiveB)); // 10 в двоичной системе 00001010
        System.out.println("-42 & -15 = " + (negativeA & negativeB)); // -48 в двочиной системе 11010000

        // Операция XOR (^)

        System.out.println("\n\tОперация XOR (^)");
        System.out.println("42 ^ 15 = " + (positiveA ^ positiveB)); // 37 в двоичной системе 00100101
        System.out.println("-42 ^ -15 = " + (negativeA ^ negativeB)); // 39 в двочиной системе 00100111

        // Операция NOT (~) - (ивертирует все биты)

        System.out.println("\n\tОперация NOT (~) - (ивертирует все биты)");
        System.out.println("~ 42 = " + ~positiveA); // -43 в двоичной системе 11010101
        System.out.println("~ 15 = " + ~positiveB); // -16 в двоичной системе 11110000
        System.out.println("~ -42 = " + ~negativeA); // 41 в двочиной системе 00101001
        System.out.println("~ -15 = " + ~negativeB); // 14 в двоичной системе 00001110

        // Операция сдвига влево (<<)

        System.out.println("\n\tОперация сдвига влево (<<)");
        System.out.println("42 << 15 = " + (positiveA << positiveB)); // 1376256 в двоичной системе 101010000000000000000
        System.out.println("-42 << -15 = " + (negativeA << negativeB)); // -5505024 в двоичной системе 11111111101011000000000000000000

        // Операция сдвига вправо (>>)

        System.out.println("\n\tОперация сдвига вправо (>>)");
        System.out.println("42 >> 15 = " + (positiveA >> positiveB)); // 0 в двоичной системе 0
        System.out.println("-42 >> -15 = " + (negativeA >> negativeB)); // -1 в двоичной системе 11111111111111111111111111111111


        // Операция сдвига вправо без учета знака (>>>)

        System.out.println("\n\tОперация сдвига вправо без учета знака (>>>)");
        System.out.println("42 >>> 15 = " + (positiveA >>> positiveB)); // 0 в двоичной системе 0
        System.out.println("-42 >>> -15 = " + (negativeA >>> negativeB)); // 32767 в двоичной системе 00000000000000000111111111111111

        // Операции с присваиванием

        System.out.println("\t\nОперации с присваиванием");

        System.out.println("\nОперация |= \n42 => " + pozRezult1 + "\n-42 => " + negRezult1);

        System.out.println("\nОперация &= \n42 => " + pozRezult2 + "\n-42 => " + negRezult2);

        System.out.println("\nОперация ^= \n42 => " + pozRezult3 + "\n-42 => " + negRezult3);

        System.out.println("\nОперация <<=\n42 => " + pozRezult4 + "\n-42 => " + negRezult4);

        System.out.println("\nОперация >>=\n42 => " + pozRezult5 + "\n-42 => " + negRezult5);

        System.out.println("\nОперация >>>=\n42 => " + pozRezult6 + "\n-42 => " + negRezult6);


    }

}

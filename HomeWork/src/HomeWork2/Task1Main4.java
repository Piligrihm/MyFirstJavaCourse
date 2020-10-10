package HomeWork2;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Task1Main4 {
    public static void main(String[] args) {
        long a = 1;
        int b = 3;

        System.out.println("LONG MAX VALUE\n" + Long.MAX_VALUE);

        do {
            a *= b;

        } while (a < Long.MAX_VALUE / 3);

        System.out.println("а - до переполнения " + a);
        System.out.println("а - после переполнения " + a * b);
    }


}

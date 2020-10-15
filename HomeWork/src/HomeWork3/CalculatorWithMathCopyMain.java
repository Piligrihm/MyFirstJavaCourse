package HomeWork3;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calc2 = new CalculatorWithMathCopy();

        System.out.println(calc2.addition(calc2.addition(4.1,calc2.multiplication(15,7)), calc2.powers(calc2.division(28,5),2 )));

    }
}

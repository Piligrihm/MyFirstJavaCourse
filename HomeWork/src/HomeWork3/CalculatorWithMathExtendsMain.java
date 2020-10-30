package HomeWork3;

public class CalculatorWithMathExtendsMain {


    public static void main(String[] args) {

        CalculatorWithMathExtends calc3 = new CalculatorWithMathExtends();

        System.out.println(calc3.addition(calc3.addition(4.1, calc3.multiplication(15, 7)), calc3.powers(calc3.division(28, 5), 2)));
    }
}

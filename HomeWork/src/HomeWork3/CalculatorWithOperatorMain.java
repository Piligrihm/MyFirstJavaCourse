package HomeWork3;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {

        CalculatorWithOperator calc1 = new CalculatorWithOperator();

        System.out.println(calc1.addition(calc1.addition(4.1, calc1.multiplication(15, 7)), calc1.powers(calc1.division(28, 5), 2)));

    }
}

package HomeWork3;

public class CalculatorWithCounterMain {
    public static void main(String[] args) {
        CalculatorWithCounter calc = new CalculatorWithCounter(new CalculatorWithOperator());

        System.out.println(calc.addition(4.1, (calc.addition(calc.multiplication(15, 7), calc.powers(calc.division(28, 5), 2)))));
        System.out.println(calc.getCountOperation());
    }

}

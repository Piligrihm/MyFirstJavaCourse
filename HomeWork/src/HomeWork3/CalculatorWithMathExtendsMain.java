package HomeWork3;

public class CalculatorWithMathExtendsMain {

    public static void main(String[] args) {
        CalculatorWithMathExtends calc3 = new CalculatorWithMathExtends();

        System.out.println(calc3.slozhenie(calc3.slozhenie(4.1, calc3.umnozhenie(15, 7.0)), calc3.vozvStepen(calc3.delenie(28, 5.0), 2)));
    }
}

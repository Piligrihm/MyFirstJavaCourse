package HomeWork3;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc1 = new CalculatorWithOperator();

        System.out.println(calc1.slozhenie(calc1.slozhenie(4.1,calc1.umnozhenie(15,7.0)), calc1.vozvStepen((float) calc1.delenie(28,5.0),2 )));

    }
}

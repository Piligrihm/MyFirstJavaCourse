package HomeWork3;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calc2 = new CalculatorWithMathCopy();
        double a = 4.1;
        int b = 15;
        int c = 7;
        int d = 28;
        double e = 5.f;
        int f = 2;

       // "4.1+15*7+(28/5)^2 = "

        System.out.println(calc2.slozhenie(calc2.slozhenie(4.1,calc2.umnozhenie(15,7.0)), calc2.vozvStepen((float) calc2.delenie(28,5.0),2 )));

    }
}

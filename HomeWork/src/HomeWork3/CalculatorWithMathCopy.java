package HomeWork3;

public class CalculatorWithMathCopy implements ICalculator{
    public double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) { return a / b; }

    public double powers(double a, int b) {
         return Math.pow(a,b);
    }

    public double absolut(double a) {
           return Math.abs(a);
    }

    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}

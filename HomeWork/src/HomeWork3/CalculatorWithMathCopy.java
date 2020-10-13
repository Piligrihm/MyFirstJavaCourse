package HomeWork3;

public class CalculatorWithMathCopy {
    public double slozhenie(double a, double b) {
        return a + b;
    }

    public double vychitanie(double a, double b) {
        return a - b;
    }

    public double umnozhenie(int a, double b) {
        return a * b;
    }

    public double delenie(int a, double b) {
        return a / b;
    }


    public double vozvStepen(double a, int b) {
         return Math.pow(a,b);
    }

    public double modul(double a) {
           return Math.abs(a);
    }

    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}

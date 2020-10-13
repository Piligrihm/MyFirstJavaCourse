package HomeWork3;

public class CalculatorWithOperator {

    public double slozhenie(double a, double b) {
        return a + b;
    }

    public double vychitanie(double a, double b) {
        return a - b;
    }

    public double umnozhenie(int a, double b) {
        return a * b;
    }

    public double delenie(float a, double b) {
        return a / b;
    }

    public double vozvStepen(double a, int b) {
        for (int i = 1; i < b; i++) {
            if (a > 0) {
                a *= a;
            } else {
                System.out.println("Error!");
            }
        }
        return (int) a;
    }

    public double modul(double a) {
        if (a <= 0.0) {
            a = 0.0 - a;
        }
        return a;
    }

    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}

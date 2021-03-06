package HomeWork3;

public class CalculatorWithOperator implements ICalculator {

    /*
    операция сложения
    @param double a
    @param double b
    @ return а + b
    */

    public double addition(double a, double b) {
        return a + b;
    }

    /*
    операция вычитания
    @param double a
    @param double b
    @ return а - b
    */

    public double subtraction(double a, double b) {
        return a - b;
    }

    /*
    операция умножения
    @param double a
    @param double b
    @ return а * b
    */

    public double multiplication(double a, double b) {
        return a * b;
    }

    /*
    операция деления
    @param double a
    @param double b
    @ return а / b
    */

    public double division(double a, double b) {
        return a / b;
    }

    /*
    операция возведения в степень
    @param double a
    @param int b
    @ return а в степени b
    */

    public double powers(double a, int b) {
        for (int i = 1; i < b; i++) {
            if (a > 0) {
                a *= a;
            } else {
                System.out.println("Error!");
            }
        }
        return (int) a;
    }

    /*
    операция получения модуля числа
    @param double a
    @ return модуль числа а
    */

    public double absolut(double a) {
        if (a <= 0.0) {
            a = 0.0 - a;
        }
        return a;
    }

    /*
    операция извлечения квадратного корня
    @param double a
    @ return квадратный корень числа а
    */

    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}

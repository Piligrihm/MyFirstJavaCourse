package HomeWork3;

public class CalculatorWithMathExtends extends CalculatorWithOperator {
    @Override
    public double addition(double a, double b) {
        return super.addition(a, b);
    }

    @Override
    public double subtraction(double a, double b) {
        return super.subtraction(a, b);
    }

    @Override
    public double multiplication(int a, double b) {
        return super.multiplication(a, b);
    }

    @Override
    public double division(float a, double b) {
        return super.division(a, b);
    }

    /*
    операция возведения в степень (переопределяет родительский метод)
     @param double a
     @param int b
     @ return а в степени b
     */
    @Override
    public double powers(double a, int b) {
        for (int i = 1; i < b; i++) {
            if (a > 0) {
                a = Math.pow(a, b);
            } else {
                System.out.println("Error!");
            }
        }
        return a;
    }

    /*
     операция получения модуля числа (переопределяет родительский метод)
     @param double a
     @ return модуль числа а
      */
    @Override
    public double absolut(double a) {
        return Math.abs(a);
    }

    /*
     операция извлечения квадратного корня (переопределяет родительский метод)
     @param double a
     @ return квадратный корень числа а
      */
    @Override
    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}

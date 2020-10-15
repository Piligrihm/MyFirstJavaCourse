package HomeWork3;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

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
     операция извлечения квадратного корня (переопределяет родительский метод)+

     @param double a
     @ return квадратный корень числа а
      */
    @Override
    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}

package HomeWork3;

public class CalculatorWithMathExtends extends CalculatorWithOperator{
    @Override
    public double slozhenie(double a, double b) {
        return super.slozhenie(a, b);
    }

    @Override
    public double vychitanie(double a, double b) {
        return super.vychitanie(a, b);
    }

        @Override
    public double umnozhenie(int a, double b) {
        return super.umnozhenie(a, b);
    }

    @Override
    public double delenie(float a, double b) {
        return super.delenie(a, b);
    }

    @Override
    public double vozvStepen(double a, int b) {
        for (int i = 1; i < b; i++) {
            if (a > 0) {
                a = Math.pow(a, b);
            } else {
                System.out.println("Error!");
            }
        }
        return a;
    }

    @Override
    public double modul(double a) {
        return Math.abs(a);
    }

    @Override
    public double sqrt(double a) {
        return Math.sqrt(a);
      }
}

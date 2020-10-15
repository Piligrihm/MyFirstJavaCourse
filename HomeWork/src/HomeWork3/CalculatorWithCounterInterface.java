package HomeWork3;

public class CalculatorWithCounterInterface {
    private final ICalculator calc;
    private long counter;

    public CalculatorWithCounterInterface(ICalculator calc) {
        this.calc = calc;
    }


    private void incrementCount() {
        this.counter++;
    }

    public double addition(double a, double b) {
        this.incrementCount();
        return calc.addition(a, b);

    }

    public double subtraction(double a, double b) {
        this.incrementCount();
        return calc.subtraction(a, b);
    }

    public double multiplication(int a, double b) {
        this.incrementCount();
        return calc.multiplication(a, b);
    }


    public double division(float a, double b) {
        this.incrementCount();
        return calc.division(a, b);
    }

    public double powers(double a, int b) {
        this.incrementCount();
        return calc.powers(a, b);
    }

    public double absolut(double a) {
        this.incrementCount();
        return calc.absolut(a);
    }

    public double sqrt(double a) {
        this.incrementCount();
        return calc.sqrt(a);
    }


    public long getCountOperation() { return counter;  }

}

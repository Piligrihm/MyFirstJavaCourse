package HomeWork3;

public class CalculatorWithCounterDecorator implements ICalculator {

    private long counter;
    private final ICalculator calc;

    public CalculatorWithCounterDecorator(ICalculator calc){
        this.calc = calc;
    }

    private void incrementCount(){
        this.counter++;
    }

    public double addition (double a, double b){
        this.incrementCount();
        return this.calc.addition(a, b);
    }

    public double subtraction (double a, double b){
        this.incrementCount();
        return this.calc.subtraction(a, b);
    }

    public double multiplication(double a, double b){
        this.incrementCount();
        return this.calc.multiplication(a, b);
    }

    public double division(double a, double b){
        this.incrementCount();
        return this.calc.division(a, b);
    }

    public double powers(double a, int b){
        this.incrementCount();
        return this.calc.powers(a, b);

    }

    public double absolut(double a){
        this.incrementCount();
        return this.calc.absolut(a);

    }

    public double sqrt(double a){
        this.incrementCount();
        return this.calc.sqrt(a);

    }

    public long getCountOperation(){
        return counter;
    }

    public ICalculator getCalculator(){
        return this.calc;
    }

}

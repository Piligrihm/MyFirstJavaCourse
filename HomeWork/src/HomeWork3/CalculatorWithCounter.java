package HomeWork3;

public class CalculatorWithCounter {

    private long counter;
    private CalculatorWithOperator calc1;
    private CalculatorWithMathCopy calc2;
    private CalculatorWithMathExtends calc3;

    public CalculatorWithCounter(CalculatorWithOperator calculator) {
        this.calc1 = calculator;
        this.calc1 = null;
        this.calc1 = null;
    }

    public CalculatorWithCounter(CalculatorWithMathCopy calculator) {
        this.calc1 = null;
        this.calc2 = calculator;
        this.calc3 = null;

    }

    public CalculatorWithCounter(CalculatorWithMathExtends calculator) {
        this.calc1 = null;
        this.calc2 = null;
        this.calc3 = calculator;

    }

    private void incrementCount(){this.counter++;}

    public double addition(double a, double b) {
        this.incrementCount();
        if (this.calc1 != null) {
            return this.calc1.addition(a, b);
        } else if (this.calc2 != null) {
            return this.calc2.addition(a, b);
        }
        return this.calc3.addition(a, b);

    }

    public double subtraction(double a, double b) {
        if (this.calc1 != null) {
            return this.calc1.subtraction(a, b);
        } else if (this.calc2 != null) {
            return this.calc2.subtraction(a, b);
        }
        return this.calc3.subtraction(a, b);

    }

    public double multiplication(int a, double b) {
        if (this.calc1 != null) {
            return this.calc1.multiplication(a, b);
        } else if (this.calc2 != null) {
            return this.calc2.multiplication(a, b);
        }
        return this.calc3.multiplication(a, b);

    }

    public double division(float a, double b) {
        if (this.calc1 != null) {
        return this.calc1.division(a, b);
        } else if (this.calc2 != null) {
        return this.calc2.division(a, b);
        }
        return this.calc3.division(a, b);

        }

    public double powers(double a, int b) {
        if (this.calc1 != null) {
        return this.calc1.powers(a, b);
        } else if (this.calc2 != null) {
        return this.calc2.powers(a, b);
        }
        return this.calc3.powers(a, b);

        }

    public double absolut(double a) {
        if (this.calc1 != null) {
        return this.calc1.absolut(a);
        } else if (this.calc2 != null) {
        return this.calc2.absolut(a);
        }
        return this.calc3.absolut(a);

        }

    public double sqrt(double a) {
        if (this.calc1 != null) {
        return this.calc1.sqrt(a);
        } else if (this.calc2 != null) {
        return this.calc2.sqrt(a);
        }
        return this.calc3.sqrt(a);

        }

    public long getCountOperation(){
        return counter;
    }
}
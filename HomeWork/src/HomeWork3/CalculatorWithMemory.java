package HomeWork3;

public class CalculatorWithMemory {

    private long counter;
    public double memory;
    private CalculatorWithOperator calc1;
    private CalculatorWithMathCopy calc2;
    private CalculatorWithMathExtends calc3;

    public CalculatorWithMemory(CalculatorWithOperator calculator) {
        this.calc1 = calculator;
        this.calc1 = null;
        this.calc1 = null;
    }

    public CalculatorWithMemory(CalculatorWithMathCopy calculator) {
        this.calc1 = null;
        this.calc2 = calculator;
        this.calc3 = null;

    }

    public CalculatorWithMemory(CalculatorWithMathExtends calculator) {
        this.calc1 = null;
        this.calc2 = null;
        this.calc3 = calculator;

    }

    private void incrementCount() {
        this.counter++;
    }

    public double addition(double a, double b) {
        this.incrementCount();
        if (this.calc1 != null) {
            memory = calc1.addition(a, b);
            return this.calc1.addition(a, b);
        } else if (this.calc2 != null) {
            memory = calc2.addition(a, b);
            return this.calc2.addition(a, b);
        }
        memory = calc3.addition(a, b);
        return this.calc3.addition(a, b);


    }

    public double subtraction(double a, double b) {
        this.incrementCount();
        if (this.calc1 != null) {
            memory = calc1.subtraction(a, b);
            return this.calc1.subtraction(a, b);
        } else if (this.calc2 != null) {
            memory = calc2.subtraction(a, b);
            return this.calc2.subtraction(a, b);
        }
        memory = calc3.subtraction(a, b);
        return this.calc3.subtraction(a, b);

    }

    public double multiplication(double a, double b) {
        this.incrementCount();
        if (this.calc1 != null) {
            memory = calc1.multiplication(a, b);
            return this.calc1.multiplication(a, b);
        } else if (this.calc2 != null) {
            memory = calc2.multiplication(a, b);
            return this.calc2.multiplication(a, b);
        }
        memory = calc3.multiplication(a, b);

        return this.calc3.multiplication(a, b);

    }

    public double division(double a, double b) {
        this.incrementCount();
        if (this.calc1 != null) {
            memory = calc1.division(a, b);
            return this.calc1.division(a, b);
        } else if (this.calc2 != null) {
            memory = calc2.division(a, b);
            return this.calc2.division(a, b);
        }
        memory = calc3.division(a, b);
        return this.calc3.division(a, b);

    }

    public double powers(double a, int b) {
        this.incrementCount();
        if (this.calc1 != null) {
            memory = calc1.powers(a, b);
            return this.calc1.powers(a, b);
        } else if (this.calc2 != null) {
            memory = calc2.powers(a, b);
            return this.calc2.powers(a, b);
        }
        memory = calc3.powers(a, b);
        return this.calc3.powers(a, b);

    }

    public double absolut(double a) {
        this.incrementCount();
        if (this.calc1 != null) {
            memory = calc1.absolut(a);
            return this.calc1.absolut(a);
        } else if (this.calc2 != null) {
            memory = calc2.absolut(a);
            return this.calc2.absolut(a);
        }
        memory = calc3.absolut(a);
        return this.calc3.absolut(a);

    }

    public double sqrt(double a) {
        this.incrementCount();
        if (this.calc1 != null) {
            memory = calc3.sqrt(a);
            return this.calc1.sqrt(a);
        } else if (this.calc2 != null) {
            memory = calc3.sqrt(a);
            return this.calc2.sqrt(a);
        }
        memory = calc3.sqrt(a);
        return this.calc3.sqrt(a);

    }

    public long getCountOperation() {
        return counter;
    }

    public void writeMemory() {

    }

    public double getMemory(CalculatorWithOperator calculator) {
        return memory;
    }
}


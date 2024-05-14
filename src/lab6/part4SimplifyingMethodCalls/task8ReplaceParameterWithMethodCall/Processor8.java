package lab6.part4SimplifyingMethodCalls.task8ReplaceParameterWithMethodCall;

public class Processor8 {
    private Calculator8 calculator;

    public Processor8(Calculator8 calculator) {
        this.calculator = calculator;
    }

    public int process() {
        // Використання результату
        return calculator.add(getX(), getY());
    }

    private int getX() {

        return 1;
    }

    private int getY() {

        return 10;
    }
}

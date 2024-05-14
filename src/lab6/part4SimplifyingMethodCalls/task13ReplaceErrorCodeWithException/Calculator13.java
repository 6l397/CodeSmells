package lab6.part4SimplifyingMethodCalls.task13ReplaceErrorCodeWithException;

public class Calculator13 {
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Ділення на нуль неможливе");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Результат ділення: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}

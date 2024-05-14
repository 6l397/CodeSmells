package lab6.part4SimplifyingMethodCalls.task14ReplaceExceptionWithTest;

public class TemperatureConverter {
    public static double convertToCelsius(double fahrenheit) {
        if (fahrenheit < -459.67) {
            throw new IllegalArgumentException("Неприпустима температура: менше абсолютного нуля");
        }
        return (fahrenheit - 32) * 5 / 9.0;
    }

    public static void main(String[] args) {
        try {
            double celsius = convertToCelsius(-500);
            System.out.println("Температура в градусах Цельсія: " + celsius);
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}

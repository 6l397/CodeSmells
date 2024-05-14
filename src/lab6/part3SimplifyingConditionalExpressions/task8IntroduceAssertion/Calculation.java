package lab6.part3SimplifyingConditionalExpressions.task8IntroduceAssertion;

public class Calculation {
    public Double calculateAverage(int[] numbers) {
        if (numbers == null) {
            return null;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }
}

package lab6.part4SimplifyingMethodCalls.task5ParameterizeMethod;

public class Calculator5 {
    public int calculate(int num, int pow) {
    int result = 1;

    for (int i = 0; i < pow; i++) {
        result *= num;
    }

    return result;
}
}

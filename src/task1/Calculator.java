package task1;

import java.util.function.IntBinaryOperator;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();


        System.out.println(calculator.operateBinary(5, 6, (a, b) -> a + b));
        System.out.println(calculator.operateBinary(5, 10, (a, b) -> a - b));

    }

    private int operateBinary(int a, int b, IntBinaryOperator integerMath){
        return integerMath.applyAsInt(a, b);
    }
}

package calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int exponentiate(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public int divideAndSqrt(int a, int b) {
        int temp = divide(a, b);
        return (int)Math.sqrt(temp);
    }
}

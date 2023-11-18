package mathematical;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class mathematical
{
    // Arithmetic Operations
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static double divide(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    // Statistical Operations
    public static double mean(int[] numbers) {
        return IntStream.of(numbers).average().orElse(0.0);
    }

    public static double mean(double[] numbers) {
        return DoubleStream.of(numbers).average().orElse(0.0);
    }

    public static double variance(int[] numbers) {
        double mean = mean(numbers);
        return IntStream.of(numbers)
            .mapToDouble(num -> Math.pow(num - mean, 2))
            .average()
            .orElse(0.0);
    }

    public static double variance(double[] numbers) {
        double mean = mean(numbers);
        return DoubleStream.of(numbers)
            .map(num -> Math.pow(num - mean, 2))
            .average()
            .orElse(0.0);
    }

    // Trigonometric Operations
    public static double sine(double angle) {
        return Math.sin(Math.toRadians(angle));
    }

    public static double cosine(double angle) {
        return Math.cos(Math.toRadians(angle));
    }

    public static double tangent(double angle) {
        return Math.tan(Math.toRadians(angle));
    }
}


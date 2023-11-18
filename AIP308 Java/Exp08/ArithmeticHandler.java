import java.util.Scanner;

public class ArithmeticHandler
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        try
        {
            double additionResult = add(num1, num2);
            System.out.println("Addition Result: " + additionResult);

            try
            {
                double subtractionResult = subtract(num1, num2);
                System.out.println("Subtraction Result: " + subtractionResult);
            }
            catch (ArithmeticException e)
            {
                System.err.println("Subtraction Error: " + e.getMessage());
            }

            try
            {
                double multiplicationResult = multiply(num1, num2);
                System.out.println("Multiplication Result: " + multiplicationResult);
            }
            catch (ArithmeticException e)
            {
                System.err.println("Multiplication Error: " + e.getMessage());
            }

            try
            {
                double divisionResult = divide(num1, num2);
                System.out.println("Division Result: " + divisionResult);
            }
            catch (ArithmeticException e)
            {
                System.err.println("Division Error: " + e.getMessage());
            }
        }
        catch (ArithmeticException e)
        {
            System.err.println("Addition Error: " + e.getMessage());
        }

        scanner.close();
    }

    public static double add(double num1, double num2)
    {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2)
    {
        if (num1 < num2)
        {
            throw new ArithmeticException("Subtraction result is negative.");
        }
        return num1 - num2;
    }

    public static double multiply(double num1, double num2)
    {
        return num1 * num2;
    }

    public static double divide(double num1, double num2)
    {
        if (num2 == 0)
        {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }
}

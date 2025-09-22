import java.util.Scanner;

class Calculator {
    // Method to perform calculation based on operation type
    public double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "add":
            case "addition":
                return a + b;
            case "sub":
            case "subtract":
            case "subtraction":
                return a - b;
            case "mul":
            case "multiply":
            case "multiplication":
                return a * b;
            case "div":
            case "divide":
            case "division":
                if (b == 0) {
                    throw new ArithmeticException("Error: Division by zero is not allowed.");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operation type: " + operation);
        }
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = sc.next();

        // Create Calculator object
        Calculator calc = new Calculator();

        try {
            double result = calc.calculate(a, b, operation);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

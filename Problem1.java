import java.util.*;
class Calculator {
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }
    public static double operate(double a, double b, String operation) {
        String op = operation.trim().toLowerCase();
        switch (op) {
            case "add": case "+":
                return add(a, b);
            case "subtract": case "-":
                return subtract(a, b);
            case "multiply": case "*":
                return multiply(a, b);
            case "divide": case "/":
                return divide(a, b);
            default:
                throw new IllegalArgumentException("Unsupported operation: " + operation);
        }
    }
}
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Simple Calculator ===");
        System.out.println("Type '+' '-' '*' '/' or words like 'add', 'subtract'");
        System.out.println("Type 'exit' to quit.\n");
        while (true) {
            try {
                System.out.print("Enter first number: ");
                if (!sc.hasNextDouble()) break;
                double a = sc.nextDouble();

                System.out.print("Enter second number: ");
                if (!sc.hasNextDouble()) break;
                double b = sc.nextDouble();

                System.out.print("Enter operation: ");
                String op = sc.next();
                if (op.equalsIgnoreCase("exit")) break;

                double result = Calculator.operate(a, b, op);
                System.out.println("Result: " + result);
                System.out.println();

            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Calculator closed.");
        sc.close();
    }
}

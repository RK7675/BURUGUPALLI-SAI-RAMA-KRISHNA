import java.util.Scanner;

class Calculator {
    double operate(double a, double b, String op) {
        switch (op) {
            case "add":
                return a + b;
            case "sub":
                return a - b;
            case "mul":
                return a * b;
            case "div":
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Division by zero error");
                    return 0;
                }
            default:
                System.out.println("Invalid operation");
                return 0;
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String op = sc.next();

        Calculator calc = new Calculator();
        double result = calc.operate(a, b, op);
        System.out.println("Result: " + result);
    }
}

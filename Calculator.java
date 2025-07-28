import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Take input from user
        double num1, num2; //Take number
        char operator; //which operation will u perform +,-,*,/
        double result;

        while (true) {
            System.out.println("\n--- Simple Calculator ---");
            System.out.print("Enter first number: ");
            num1 = sc.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            operator = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            num2 = sc.nextDouble();

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result = " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result = " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result = " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Error: Division by zero");
                    }
                    break;
                default:
                    System.out.println("Invalid operator!");
            }

            System.out.print("Do you want to continue? (y/n): ");
            char cont = sc.next().charAt(0);
            if (cont == 'n' || cont == 'N') {
                System.out.println("Calculator closed.");
                break;
            }
        }

        sc.close();
    }
}

package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        char continueCalculation;



        do {
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();

            System.out.print("Enter second number: ");
            int b = scanner.nextInt();

            System.out.print("Please enter one of the symbols +, -, *, /: ");
            char symbol = scanner.next().charAt(0);

            // Perform the calculation based on the symbol
            calculator.calculateResult(a, b, symbol);

            System.out.print("Would you like to do more calculations? Please enter 'Y' or 'N': ");
            continueCalculation = scanner.next().charAt(0);

        } while (Character.toUpperCase(continueCalculation) == 'Y');

        System.out.println("Thank you for using the calculator. Goodbye!");
        scanner.close();
    }
}




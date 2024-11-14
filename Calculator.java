import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Flag to control the loop for continuous calculations
        boolean continueCalculating = true;

        // Loop until the user decides to quit
        while (continueCalculating) {
            // Prompt user for the first number
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            // Prompt user for the second number
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            // Perform arithmetic operations and store the results
            int sum = num1 + num2;
            int difference = num1 - num2;
            int product = num1 * num2;

            // Print the results of addition, subtraction, and multiplication
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);

            // Check for division by zero before calculating quotient and remainder
            if (num2 != 0) {
                int quotient = num1 / num2;
                int remainder = num1 % num2;
                System.out.println("Quotient: " + quotient);
                System.out.println("Remainder: " + remainder);
            } else {
                System.out.println("Cannot divide by zero. Quotient and remainder are undefined.");
            }

            // Prompt the user for the next action: clear (AC) or quit (Q)
            System.out.print("Press 'AC' to clear and start a new calculation, or 'Q' to quit: ");
            String userInput = scanner.next();

            // Check the user's input
            if (userInput.equalsIgnoreCase("Q")) {
                // If the user enters 'Q', set flag to false to exit the loop
                continueCalculating = false;
            } else if (userInput.equalsIgnoreCase("AC")) {
                // If the user enters 'AC', display a message and restart the loop for a new calculation
                System.out.println("\n--- Starting New Calculation ---\n");
            } else {
                // For any other input, show an error message and exit the loop
                System.out.println("Invalid input. Exiting calculator.");
                continueCalculating = false;
            }
        }

        // Close the scanner and print a closing message
        scanner.close();
        System.out.println("Calculator closed.");
    }
}

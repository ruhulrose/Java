package Result;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Enter 1 to input marks or 0 to stop: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter the student's marks (out of 100): ");
                int marks = scanner.nextInt();

                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } else if (marks >= 0 && marks <= 59) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid marks entered, please enter marks between 0 and 100.");
                }
            } else if (choice != 0) {
                System.out.println("Invalid input, please enter either 1 or 0.");
            }
        } while (choice != 0);

        System.out.println("Program stopped.");
        scanner.close();
    }
}

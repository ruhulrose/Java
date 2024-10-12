package SimpleCalculator;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose any one -->");
        System.out.println("1 (Addition.)");
        System.out.println("2 (Subtraction)");
        System.out.println("3 (Multiplication)");
        System.out.println("4 (Division)");
        System.out.println("5 (Remainder)");
        int n = input.nextInt();
        // System.out.print("Enter first number: ");
        // int a= input.nextInt();
        // System.out.print("Enter second number: ");
        // int b= input.nextInt();
        switch (n) {
            case 1: {
                System.out.print("Enter first number: ");
                int a = input.nextInt();
                System.out.print("Enter second number: ");
                int b = input.nextInt();
                int sum = a + b;
                System.out.print("Total sum is: " + sum);
                break;
            }
            case 2: {
                System.out.print("Enter first number: ");
                int a = input.nextInt();
                System.out.print("Enter second number: ");
                int b = input.nextInt();
                int sub = a - b;
                System.out.print("Subtraction is: " + sub);
                break;
            }
            case 3: {
                System.out.print("Enter first number: ");
                int a = input.nextInt();
                System.out.print("Enter second number: ");
                int b = input.nextInt();
                int multi = a * b;
                System.out.print("Multiplication is: " + multi);
                break;
            }
            case 4: {
                System.out.print("Enter first number: ");
                int a = input.nextInt();
                System.out.print("Enter second number: ");
                int b = input.nextInt();
                int div = a / b;
                System.out.print("Division is: " + div);
                break;
            }
            case 5: {
                System.out.print("Enter first number: ");
                int a = input.nextInt();
                System.out.print("Enter second number: ");
                int b = input.nextInt();
                int mod = a % b;
                System.out.print("Remainder is: " + mod);
                break;
            }
            default:
                System.out.print("Wrong input. Try again.");
        }

    }
}

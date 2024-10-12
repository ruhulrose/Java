package NumberCounter;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int zero = 0;
        int positive = 0;
        int negative = 0;
        System.out.println("Enter 1 for continue\nEnter 0 for exit");
        int n = in.nextInt();
        while (n == 1) {
            System.out.print("Enter a number: ");
            int b = in.nextInt();
            if (b > 0) {
                positive = positive + 1;
            } else if (b == 0) {
                zero = zero + 1;
            } else {
                negative = negative + 1;
            }
            System.out.println("Enter 1 for continue\nEnter 0 for exit");
            n = in.nextInt();
        }
        System.out.println("Total positive number is: " + positive);
        System.out.println("Total negative number is: " + negative);
        System.out.println("Total zero number is: " + zero);
    }
}

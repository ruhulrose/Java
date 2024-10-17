package Recursion;
// Print x^n (with stack height = logn)

import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = in.nextInt();
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        int ans = printPower(x, n);
        System.out.print("Answer is: " + ans);
    }

    static int printPower(int a, int b) {
        if (b == 0) {
            return 1;
        }
//        if (a == 0) {
//            return 0;
//        }
        if (b % 2 == 0) {
            return printPower(a, b / 2) * printPower(a, b / 2);
        } else {
            return printPower(a, b / 2) * printPower(a, b / 2) * a;
        }
    }
}
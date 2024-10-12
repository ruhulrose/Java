package ReaturnBiggest;

import java.util.Scanner;

public class Solution {
    public static void gratter(int a, int b) {
        System.out.print("The biggest number is: ");
        if (a < b)
            System.out.print(b);
        else
            System.out.print(a);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        gratter(a, b);
    }
}

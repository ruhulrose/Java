package FibonacciSeries;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total number of series: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " , ");
        for (int i = 2; i <= n; i++) {
            System.out.print(b + " , ");
            int k = b;
            b = a + b;
            a = k;
        }
    }
}

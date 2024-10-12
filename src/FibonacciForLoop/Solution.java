package FibonacciForLoop;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = 0, n2 = 1, n3, count;
        System.out.print("Enter Fibonacci size: ");
        count = input.nextInt();
        System.out.print(n1+" "+n2+" ");
        for (int i = 2; i < count; i++) {
            n1 = n2 + n1;
            n2 = n1 + n2;
            System.out.print(n1 + " ");
            i++;
            if(i<count){
                System.out.print(n2+" ");
            }
        }
    }
}

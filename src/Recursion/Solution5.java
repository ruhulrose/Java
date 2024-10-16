package Recursion;
// Print factorial of a number n

import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n= in.nextInt();
        int fact= 1;
        Factorial(n, fact, n);
    }
    static void Factorial(int x, int fact, int n){
        if(x==0){
            System.out.print("Factorial of "+n+" is = "+fact);
            return;
        }
        fact*=x;
        Factorial(x-1, fact, n);
    }
}

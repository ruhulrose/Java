package Recursion;
// A program which find the factorial of any number

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter number to want factorial: ");
        int n= in.nextInt();
        System.out.println("Factorial of "+n+" is : "+factorial(n) );
    }
    static int factorial(int x){
        int result =1;
        if(x==0 || x== 1){
            return 1;
        }
        else {
            return result= x * factorial(x-1);
        }
    }
}

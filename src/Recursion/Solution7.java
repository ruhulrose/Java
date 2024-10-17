package Recursion;
// Print x^n (with stack height= n)

import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x= in.nextInt();
        System.out.print("Enter the value of n");
        int n= in.nextInt();
        int output = printPower(x, n);
        System.out.print("The value of "+x+"^"+n+" is "+output);
    }
    static int printPower(int a, int b){
        if(b==0){
            return 1;
        }
        if(a==0){
            return 0;
        }
        int a_ = printPower(a, b-1);
        int ab= a*a_;
        return ab;
    }
}

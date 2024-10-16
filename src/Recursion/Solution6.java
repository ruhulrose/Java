package Recursion;
// Print the fibonacci sequence till nth term

import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n= in.nextInt();
        int a=0;
        int b=1;
        Fibo(a, b, n);
    }
    static void Fibo(int x, int y, int z){
        if(z==0){
            return;
        }
        System.out.print(x+ " ");
        Fibo(y, x+y, z-1);
    }
}

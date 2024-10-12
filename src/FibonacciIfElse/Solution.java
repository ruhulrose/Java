package FibonacciIfElse;

import java.util.Scanner;

public class Solution {
    public static void IfElse(int count, int n1, int n2){
        if(count>0){
            n1=n1+n2;
            n2=n1+n2;
            System.out.print(n1+" ");
            Else(count-1, n1, n2);
        }
    }
    public static void Else(int count, int n1, int n2){
        if(count>1){
            System.out.print(n2+" ");
            IfElse(count-1, n1, n2);
        }
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n1=0, n2=1;
        int count;
        System.out.print("Enter Fibonacci sequence length: ");
        count= input.nextInt();
        System.out.print(n1+" "+n2+" ");
        IfElse(count-2, n1,n2);
    }
}

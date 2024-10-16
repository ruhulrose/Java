package Recursion;
// Print number from 1 to n

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n= in.nextInt();
        int x=1;
        Solution3 obj = new Solution3();
        obj.Print(x, n);
    }
    void Print(int x, int n){
        if(x>n){
            return;
        }
        System.out.print(x+ " ");
        Print(x+1, n);
    }
}

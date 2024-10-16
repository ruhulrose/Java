package Recursion;
// Print the sum of first n natural numbers

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n= in.nextInt();
        int sum= 0;
        Solution4 obj= new Solution4();
        obj.Sum(n, sum);
    }
    void Sum(int x, int sum){
        if(x==0){
            System.out.print(" = "+sum);
            return;
        }
        else {
            System.out.print(x+ " + ");
            sum+=x;
            Sum(x-1, sum);
        }

    }
}

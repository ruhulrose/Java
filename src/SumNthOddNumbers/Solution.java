package SumNthOddNumbers;

import java.util.Scanner;

public class Solution {
    public static void oddSum(int n){
        int s=0;
        for(int i=1; i<=n; i++){
            if(i%2!=0)
                s= s+i;
        }
        System.out.print("The total value of odd number is: "+s);
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n= in.nextInt();
        oddSum(n);
    }
}

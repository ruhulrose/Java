package Factorial;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = input.nextInt();
        int n=1;
        n=IsFactorial(number);
        System.out.print("Factorial of "+number+" is "+n);
    }
    public static int IsFactorial(int number){
        int k= number;
        for(int i=1; i<k; i++){
            number= number*(k-i);
        }
        return number;
    }
}

package PrimeNumber;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n, counter=0;
        System.out.print("Enter any number: ");
        n = input.nextInt();
        for(int i= 2; i<n; i++){
            if(n%i==0){
                counter = counter+1;
            }
        }
        if(counter==0 || n==2){
            System.out.print("This is prime number.");
        }
        else{
            System.out.print("This is not a prime number.");
        }
    }
}

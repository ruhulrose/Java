package PrimeForLoop;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number, n, count=0;
        System.out.print("Enter a number: ");
        number= input.nextInt();
        n=number/2;
        if(number==1||number==0){
            System.out.println(number+" is not a prime number.");
        }
        else{
            for(int i=2; i<n; i++){
                if(number%i==0){
                    System.out.println(number+" is not a prime number.");
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(number+" is a prime number.");
            }
        }
    }
}

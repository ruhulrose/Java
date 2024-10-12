package PrimeBoolean;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number= input.nextInt();
        if(number==0||number==1){
            System.out.print(number+" is not prime.");
        }
        else{
            if(Boolean(number)==true){
                System.out.print(number+" is prime.");
            }
            else{
                System.out.print(number+" is not prime");
            }
        }
    }
    public static boolean  Boolean(int number){
        int n= number/2;
        for(int i=2; i<n; i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}

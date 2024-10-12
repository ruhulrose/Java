package Pelondrome;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number= input.nextInt();
        int n=number;
        if(IsPelondrome(number)){
            System.out.print(number+" is a  Pelondrome number");
        }
        else{
            System.out.print(number+  " is not a Pelondrome number");
        }


    }
    public static boolean  IsPelondrome(int number){
        int n= number;
        int sum=0;
        while(n>0){
            sum=(n%10)+(sum*10);
            n=n/10;
        }
        if(sum==number){
            return true;
        }
        return false;
    }
}

package ArmStrong;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Take a number: ");
        int number= input.nextInt();
        Arm(number);
    }
    public static void Arm(int number){
        int k=number;
        int count=0;
        while(k>0){
            k=k/10;
            count++;
        }
        Strong(count, number);
    }
    public static void Strong(int count, int number){
        int k=number;
        int n=0;

        while(k>0){
            n=(int) (Math.pow((k%10), count)+n);
            k=k/10;
        }
        Cheek(number, n);
    }
    public static void Cheek(int number, int n){
        if(number==n){
            System.out.print(number+" is an Armstrong number.");
        }
        else{
            System.out.print(number+" is not an Armstrongs number");
        }
    }
}

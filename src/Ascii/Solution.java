package Ascii;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start= input.nextInt();
        System.out.print("Enter ending number: ");
        int end = input.nextInt();
        for(int i= start; i<=end; i++){
            System.out.println("The Ascii code of "+i+" is "+(char)i);
        }
    }
}

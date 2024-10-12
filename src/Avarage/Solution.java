package Avarage;

import java.util.Scanner;

public class Solution {
    public static void avareg(int a, int b, int c){
        int d= (a+b+c)/3;
        System.out.print("The avarage value is: "+ d);
        return;
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter 3 value: ");
        a= in.nextInt();
        b= in.nextInt();
        c= in.nextInt();
        avareg(a,b,c);
    }
}

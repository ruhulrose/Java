package MethodOverloading;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter Your name: ");
        String name = in.nextLine();
        Overload(name);
        System.out.print("Enter First number: ");
        int a= in.nextInt();
        System.out.print("Enter Second number: ");
        int b= in.nextInt();
        Overload(a, b);
        System.out.print("Again enter a number: ");
        int c= in.nextInt();
        System.out.println("All sum is: "+ Overload(a,b,c));
        System.out.print("Enter another number: ");
        int d= in.nextInt();
        System.out.print("Final sum is: "+ Overload(a, b,c,d));

    }
    static void Overload(String name){
        System.out.println("Hello "+name+"! Welcome you here.");
    }
    static void Overload(int a, int b){
        int c= a+b;
        System.out.println("Sum is: "+c);
    }
    static int Overload(int a, int b, int c){
        int z= a+b+c;
        return z;
    }
    static int Overload(int a, int b, int c, int d){
        int z= a+b+c+d;
        return z;
    }
}

package SumWithStaticMethod;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        System.out.print("Enter another number: ");
        int b= input.nextInt();
        System.out.print(Sum(a,b));

    }
    static int Sum(int x, int y){
        int z= x+y;
        return z;
    }
}

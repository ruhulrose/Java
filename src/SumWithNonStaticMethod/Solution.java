package SumWithNonStaticMethod;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a= input.nextInt();
        System.out.print("Enter second number: ");
        int b= input.nextInt();
        Solution obj= new Solution();
        System.out.print(obj.Sum(a,b));
    }
    int Sum(int x, int y){
     int z= x+y;
     return z;
    }
}

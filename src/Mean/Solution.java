package Mean;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter 5 integer number: ");
        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
        int d= in.nextInt();
        int e= in.nextInt();
        double mean= (a+b+c+d+e)/5.0;
        System.out.println("The mean value is: "+mean);
    }
}

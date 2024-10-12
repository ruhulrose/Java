package XPowerN;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in=new  Scanner(System.in);
        System.out.print("Enter x: ");
        int x= in.nextInt();
        System.out.print("Enter n: ");
        int n= in.nextInt();
        System.out.print("The final value is: "+Value(x, n));
    }
    public static int Value(int x, int n){
        int a=1;
        for(int i=1; i<=n; i++){
            a=a*x;
        }
        return a;
    }
}

package VarArgs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System .out.print("Enter two number: ");
        int a= in.nextInt();
        int b=in.nextInt();
        System.out.println("Sum is: "+ result(a,b));
        System.out.print("Enter Three number: ");
        int c= in.nextInt();
        int d= in.nextInt();
        int e= in.nextInt();
        System.out.println("Sum is: "+ result(c, d, e));
        System.out.print("Enter six number: ");
        int f= in.nextInt();
        int g= in.nextInt();
        int h= in.nextInt();
        int i= in.nextInt();
        int j= in.nextInt();
        int k= in.nextInt();
        System.out.println("Sum is: "+ result(f,g,h,i,j,k));
    }
    static int result(int ... arr){
        int z= 0;
        for(int a: arr){
            z+= a;
        }
        return z;
    }
}

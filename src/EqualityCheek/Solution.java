package EqualityCheek;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter 4 integer number: ");
       int a= in.nextInt();
       int b= in.nextInt();
       int c= in.nextInt();
       int d= in.nextInt();
       boolean equal= (a==b)&&(c==d);
        if (equal) {
            System.out.println("All are Equal.");
        }else {
            System.out.println("All are not Equal.");
        }
    }
}

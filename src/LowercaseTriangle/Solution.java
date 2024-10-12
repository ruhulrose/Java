package LowercaseTriangle;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the height of triangle: ");
        int n= input.nextInt();
        int number=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}

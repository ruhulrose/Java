package InversTriangle;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of triangle: ");
        int height= input.nextInt();
        for(int i= height; i>=1; i--){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<height-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

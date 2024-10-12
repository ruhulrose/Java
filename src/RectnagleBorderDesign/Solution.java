package RectnagleBorderDesign;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the height of rectangle: ");
        int height= input.nextInt();
        System.out.print("Enter the width of rectangle: ");
        int width= input.nextInt();
        for(int i=1; i<=height; i++){
            for(int j=1 ;j<=width; j++){
                if(i==1 || j==width || j==1 || i==height){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

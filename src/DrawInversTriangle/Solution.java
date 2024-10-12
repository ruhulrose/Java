package DrawInversTriangle;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the height: ");
        int height= input.nextInt();
        int n= height;
        for(int i=1; i<=height; i++){
            for(int j=n; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
            n=n-1;
        }
    }
}

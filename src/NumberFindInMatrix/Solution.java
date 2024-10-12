package NumberFindInMatrix;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter row size: ");
        int row= in.nextInt();
        System.out.print("Enter coloum size: ");
        int col= in.nextInt();
        System.out.println("Enter matrix: ");
        int[][] matrix= new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j]=in.nextInt();
            }
        }
        System.out.print("Enter x: ");
        int x= in.nextInt();
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(x==matrix[i][j]){
                    System.out.println("The value is find at ["+i+"]"+"["+j+"]");
                }
            }
        }
    }
}

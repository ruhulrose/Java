package Arrays;
//Create an array of 5 floats and calculate their sum

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        double[] arr= new double[5];
        System.out.print("Enter 5 floating numbers: ");
        for(int i=0; i<5; i++){
            arr[i]= in.nextDouble();
        }
        double sum=0;
        for (int i=0; i<5; i++){
            sum= sum+arr[i];
        }
        System.out.print("Sum of arrays is: "+sum);
    }
}

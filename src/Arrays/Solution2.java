package Arrays;
//Write a program to find out whether a given integer is present in an array or not

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] arr= new int[5];
        System.out.print("Enter any 5 value: ");
        for (int i=0; i<5; i++){
            arr[i]= in.nextInt();
        }
        System.out.println("Enter any one value: ");
        int n= in.nextInt();
        boolean bl= false;
        for (int e: arr){
            if(n==e){
                bl= true;
                break;
            }
        }
        if (bl){
            System.out.println("The value is present in the array");
        }
        else {
            System.out.println("The value is not present in the array");
        }
    }
}

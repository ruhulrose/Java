package FindMaxAndMinValue;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int size= in.nextInt();
        int[] arr= new int[size];
        for(int i=0; i<size; i++){
            arr[i]= in.nextInt();
        }
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        for(int i=0; i<size; i++){
            if(arr[i]<min){
                min= arr[i];
            }
            if(arr[i]> max){
                max= arr[i];
            }
        }
        System.out.println("The largest value is: "+ max);
        System.out.println("The minimun value is: "+ min);
    }
}

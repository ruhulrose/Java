package ArraySumAndAvarage;

import java.util.Scanner;

public class InputArray {
    public static int[] inputArray(){
        Scanner in= new Scanner(System.in);
        System.out.print("Please enter the array size: ");
        int size = in.nextInt();
        int[] array= new int[size];
        int i=0;
        while (i<size){
            System.out.print("Please enter the element no "+(i+1)+" : ");
            array[i] = in.nextInt();
            i++;
        }
        return array;
    }
}

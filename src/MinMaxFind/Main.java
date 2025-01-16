package MinMaxFind;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Welcome to the Min and Max finder program");
        int[] array= InputArray.arrayInput();
        int max= Max(array);
        int min = Min(array);
        System.out.println("Max value is: "+max);
        System.out.println("Min value is: "+min);
    }
    public static int Min(int[] array){
        int min= Integer.MAX_VALUE;
        int i=0;
        while (i<array.length){
            if(min>array[i]){
                min = array[i];
            }
            i++;
        }
        return min;
    }

    public static int Max(int[] array){
        int max= Integer.MIN_VALUE;
        int i=0;
        while (i<array.length){
            if(array[i]>max){
                max=array[i];
            }
            i++;
        }
        return max;
    }
}

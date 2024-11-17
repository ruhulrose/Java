package Arrays;
// Calculate the avarage marks from an array containing marks of all students using for-each loop

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] arr= new int[5];
        System.out.print("Enter 5 subjects marks: ");
        for(int i= 0; i<5; i++){
            arr[i]= in.nextInt();
        }
        int sum= 0;
        for (int element: arr){
            sum = sum+ element;
        }
        System.out.println("Avarage value is: "+ sum/arr.length);
    }
}

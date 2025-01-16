package OccurrenceOfNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Welcome to the Occurrence program");
        int[] array= InputArray.arrayInput();
        System.out.print("Enter the number you want to find: ");
        int number = in.nextInt();
        int occurrence= NumberOfOccurrence(array, number);
        System.out.print("This number is "+ occurrence+" time occurrence in the array");
    }
    public static int NumberOfOccurrence(int[] array, int number){
        int occurrence = 0;
        int i= 0;
        while (i<array.length){
            if(array[i]==number){
                occurrence++;
            }
            i++;
        }
        return occurrence;
    }
}

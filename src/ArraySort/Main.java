package ArraySort;

import MinMaxFind.InputArray;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the array sorted program");
        int[] array= InputArray.arrayInput();
        boolean increase = Increase(array);
        boolean decrease = Decrease(array);
        if(increase || decrease){
            System.out.println("Array is sorted.");
        }else {
            System.out.println("Array isn't sorted.");
        }
    }
    public static boolean Increase(int[] array){
        int i=1;
        while (i<array.length){
            if(array[i]<array[i-1]){
               return false;
            }
            i++;
        }
        return true;
    }
    public static boolean Decrease(int[] array){
        int i=1;
        while (i<array.length){
            if(array[i]>array[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}

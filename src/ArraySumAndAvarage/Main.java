package ArraySumAndAvarage;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to the array program");
        int[] array = InputArray.inputArray();
        long sum= Sum(array);
        double ave= average(sum, array);
        System.out.println("The sum is: "+ sum);
        System.out.println("The average is: "+ave);
    }
    static long Sum(int[] array){
        int i= 0;
        int sum=0;
        while (i<array.length){
            sum+=array[i];
            i++;
        }
        return sum;
    }
    static double average(long sum, int[] array){
        double ave=(double) sum/array.length;
        return ave;
    }
}

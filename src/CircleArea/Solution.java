package CircleArea;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int n= input.nextInt();
        double area, PI;
        PI= 3.1416;
        area= PI*n*n;
        System.out.println("The area of the circle is: "+area);
    }
}

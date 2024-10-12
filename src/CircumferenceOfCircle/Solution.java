package CircumferenceOfCircle;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of a circle: ");
        int r = in.nextInt();
        System.out.print("The circumference of the circle is: " + Area(r));
    }

    public static double Area(int r) {
        double d = 2 * 3.1416 * r * r;
        return d;
    }
}

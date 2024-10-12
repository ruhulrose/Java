package EnableForVoteOrNot;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        System.out.print("You are " + Vote(age) + " for vote");

    }

    public static String Vote(int age) {
        if (age < 18) {
            String a = "not enable";
            return a;
        } else {
            String a = "enable";
            return a;

        }
    }
}

package RockPaperSizzerGame;

import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor: ");
        int userInput = in.nextInt();
        Random random= new Random();
        int computerInput= random.nextInt(3);
        if (userInput==computerInput){
            System.out.println("Draw");
        } else if (userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2&& computerInput==1) {
            System.out.println("You Win!");
        }else {
            System.out.println("Computer Win!");
        }
        System.out.println("Computer choice: "+computerInput);
    }
}

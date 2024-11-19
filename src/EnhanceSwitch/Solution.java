package EnhanceSwitch;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int number= in.nextInt();
        int month= switch (number){
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2-> {
                System.out.print("Enter the year: ");
                int year= in.nextInt();
                boolean yearDevided4= year%4==0;
                boolean yearDevided100= year%100==0;
                boolean yearDevided400= year%400==0;
                boolean cheekYearDevided4And100= yearDevided4 && !yearDevided100;
                boolean leapyear= cheekYearDevided4And100 || yearDevided400;
                if(leapyear){
                   yield 29;
                }else {
                    yield 28;
                }
            }
            default -> 0;
        };
        System.out.print(number + " no month is "+ month+ "days.");
    }
}

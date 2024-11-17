package StringAssignment;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String obj1= new String(in.nextLine());
        System.out.println("Enter another sentence: ");
        String obj2= new String(in.nextLine());
        //length()
        System.out.println("First sentence length is "+obj1.length()+" and second sentence length is: "+obj2.length());
        // lower case and upper case
        System.out.println("Now we convert first sentence to uppercase: "+ obj1.toUpperCase());
        System.out.println("Now we convert second sentence to lowercase: "+obj2.toLowerCase());
        //trim()
        System.out.println("Now we remove all space from start and end in your both sentence and print:");
        System.out.println(obj1.trim());
        System.out.println(obj2.trim());
        //replace()
        System.out.println("Do you want replace your sentence?");
        System.out.println("Press 1 for first sentence");
        System.out.println("Press 2 for second sentence");
        int userInput= in.nextInt();
        String old, now;
        if(userInput==1){
            System.out.println("Enter old character");
            old= in.next();
            System.out.println("Enter new character");
            now= in.next();
            String replaceObj1= obj1.replace(old, now);
            System.out.println("Your new string is: "+replaceObj1);
        }else {
            System.out.println("Enter old character");
            old= in.next();
            System.out.println("Enter new character");
            now= in.next();
            String replaceObj2= obj2.replace(old, now);
            System.out.println("Your new string is: "+replaceObj2);
        }
    }
}

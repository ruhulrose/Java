package CountCharacter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Welcome to the character counter program");
        System.out.print("Enter characters: ");

        String strValue= in.nextLine();
        strValue= strValue.toLowerCase();
        char[] value= strValue.toCharArray();

        int[] count= new int[26];
        int i=0;
        while (i<value.length){
            char values= value[i];
            if(Character.isLetter(values)){
                int index= values- 'a';
                count[index]++;
            }
            i++;
        }

        System.out.println("Result: ");
        int j=0;
        while (j<count.length){
            if(count[j]!=0){
                char values = (char) (j+'a');
                System.out.println(values+ " is "+ count[j]);
            }
            j++;
        }
    }
}

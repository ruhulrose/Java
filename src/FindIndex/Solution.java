package FindIndex;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int size=in.nextInt();
        String[] name= new String[size];

        for(int i=0; i<size; i++){
            name[i]= in.next();
        }

        for(int i=0; i<size; i++){
            System.out.println("The name of index ["+i+"] is: "+name[i]);
        }
    }
}

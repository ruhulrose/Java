package Recursion;
// Print numbers from n to 1

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n= in.nextInt();
        Solution2 obj= new Solution2();
        obj.Number(n);
    }
    void Number(int n){
        if(n==0){
            return ;
        }
        System.out.print(n + " ");
        Number(n-1);
    }
}

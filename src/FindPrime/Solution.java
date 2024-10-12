package FindPrime;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = input.nextInt();
        System.out.print("Enter  ending number: ");
        int end = input.nextInt();
        for(int i=start; i<=end; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }

    }
    public static boolean isPrime(int i){
        if(i<=1){
            return false;
        }
        else{
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    return false;
                }
            }
        }
        return true;
    }
}

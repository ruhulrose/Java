package Cellphone;

class Methods{
    public void ring(){
        System.out.println("Your phone is ringing.....");
    }
    public void vibrate(){
        System.out.println("Your phone is vibrating....");
    }
    public void airplane(){
        System.out.println("Your phone is turn on airplane mode.....");
    }
}
public class Solution {
    public static void main(String[] args) {
        Methods med= new Methods();
        med.ring();
        med.vibrate();
        med.airplane();
    }
}

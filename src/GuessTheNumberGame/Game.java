package GuessTheNumberGame;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        MainGame game= new MainGame();
        System.out.printf("Hello There!\nThis is a game called Guess The Number.\nHere computer take a number between 0 to 100.\nYou need to guess whats that number.\nUse your brain and play this game. Lets enjoy :)\n");
        boolean b= false;
        while (!b){
            game.takeUserInput();
            b=game.isCorrectNumber();
        }
    }
}
class MainGame{
    public int number;
    public int inputNumber;
    public int noOfGuesses=0;

    public int getNoOfGuesses() {
            return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses= noOfGuesses;
    }
    MainGame(){
        Random rand= new Random();
        this.number=rand.nextInt(101);
    }
    void takeUserInput(){
        System.out.print("Guess the number: ");
        Scanner in= new Scanner(System.in);
        inputNumber = in.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        } else if (inputNumber<number) {
            System.out.println("Too low......");
            System.out.println("Try more big number :)");
        } else if (inputNumber>number) {
            System.out.println("Too high.....");
            System.out.println("Try more small number :)");
        }
        return false;
    }
}

package breakAndContinue;
import java.util.Random;
import java.util.Scanner;
//Write a program that generates a random number and asks the user to guess what
//the number is. If the user's guess is higher than the random number, the program
//should display "Too high, try again." If the user's guess is lower than the random
//number, the program should display "Too low, try again." The program should use
//a loop that repeats until the user correctly guesses the random number.
public class Q21 {
    public static void main(String[] args) {
        Scanner demo = new Scanner(System.in);
        Random rand = new Random();
        int val, guess,maxVal = 100;
        boolean verdict = false;
        val = rand.nextInt(maxVal) + 1;
        while (true) {
            if (verdict){
                break;
            }
            System.out.print("Guess a number between 1 and 100: ");
            guess = demo.nextInt();
            if (guess > val) {
                System.out.println("Too high, try again");
            } else if (guess < val) {
                System.out.println("Too low, try again");
            } else {
                System.out.println("Yes, you guessed the number.");
                verdict = true;
            }
        }
    }
}

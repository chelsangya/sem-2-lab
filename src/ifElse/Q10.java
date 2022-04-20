package ifElse;
import java.util.Scanner;
//Write a JAVA program to check whether a character is uppercase or lowercase alphabet.
public class Q10 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        char char1;
        System.out.print("Enter the character ");
        char1= demo.next().charAt(0);
        if (Character.isAlphabetic(char1)){
        if (Character.isUpperCase(char1)){
            System.out.println("The character is in Uppercase");
        }
        else{
            System.out.println("The character is in Lowercase");
        }} else{
            System.out.println("The input is not valid");
        }
    }
}

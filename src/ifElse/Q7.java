package ifElse;

import java.util.Scanner;
//Write a JAVA program to check whether a character is alphabet or not.
public class Q7 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        char char1;
        System.out.print("Enter the character ");
        char1= demo.next().charAt(0);
        if( (Character.isAlphabetic(char1))){
            System.out.println("It is an alphabet.");
    } else{
            System.out.println("It is not an alphabet.");
        }
}
}

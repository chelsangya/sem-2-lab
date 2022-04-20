package ifElse;

import java.util.Scanner;
//Write a JAVA program to input any character and check whether it is alphabet, digit or special
//character.
public class Q9 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        System.out.println("Enter the character ");
        char char1 ;
        char1= demo.next().charAt(0);
        if((char1 >= 'a' && char1 <= 'z') || (char1 >= 'A' && char1 <= 'Z')) {
            System.out.println(char1 + " is an alphabet.");
        } else if(char1 >= '0' && char1 <= '9') {
            System.out.println(char1 + " is a digit.");
        } else {
            System.out.println(char1 + " is a special character.");
        }
    }
}

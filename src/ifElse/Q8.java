package ifElse;

import java.util.Scanner;
// Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
public class Q8 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        String val;
        System.out.print("Enter the character ");
        val= demo.nextLine();
        val.toUpperCase();
        if ((val=="A")||(val=="E")||(val=="I")||(val=="O")||(val=="U"))
        {
            System.out.println("It is a vowel");
        } else{
            System.out.println("It is a consonant");
        }
    }
}

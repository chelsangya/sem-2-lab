package switchC;

import java.util.Scanner;
//JAVA Program to count the total number of notes in a given amount.
public class Q12 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        int amount,notes;
        System.out.print("Enter the amount ");
        amount= demo.nextInt();
        switch (amount){
            case 0:
                System.out.println("Invalid Input");
                break;
            default:
                notes=amount/5;
                System.out.println("The total number of notes is "+notes);
                break;
        }
    }
}

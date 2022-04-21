package switchC;

import java.util.Scanner;
//JAVA Program to count the total number of notes in a given amount.
public class Q12 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        int amount,notes,x;
        System.out.print("Enter the amount ");
        amount= demo.nextInt();
        x=amount%5;
        switch (x){
            case 0:
                notes=amount/5;
                System.out.println("The total number of notes is "+notes);
                break;
            default:
                System.out.println("Invalid Input");
                break;

        }
    }
}

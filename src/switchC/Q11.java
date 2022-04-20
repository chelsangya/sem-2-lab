package switchC;

import java.util.Scanner;
//JAVA Program to take the value from the user as input the month number and print number of
//days in that month. Using switch statement.
public class Q11 {
    public static void main(String[] args) {
        Scanner demo = new Scanner(System.in);
        int num;
        System.out.print("Enter the month number ");
        num = demo.nextInt();
        switch (num) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Input");
                break;


        }
    }
}
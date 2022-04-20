package ifElse;

import java.util.Scanner;
//Write a JAVA program to check whether a year is leap year or not
public class Q6 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        int year;
        boolean leap;
        System.out.print("Enter the year ");
        year= demo.nextInt();
        if (year%400==0)
        {
            System.out.println("It is a leap year.");
        }
        else if((year%4==0)&&(year%100!=0)) {
            System.out.println("It is a leap year.");
        }
        else {
            System.out.println("It is not a leap year.");
        }
    }
}
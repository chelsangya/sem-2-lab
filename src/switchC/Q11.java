package switchC;

import java.util.Scanner;
//JAVA Program to take the value from the user as input the month number and print number of
//days in that month. Using switch statement.
public class Q11 {
    public static void main(String[] args) {
        Scanner demo = new Scanner(System.in);
        int num,year,n;
        System.out.print("Enter the month number ");
        num = demo.nextInt();
        System.out.print("Enter the month number ");
        year= demo.nextInt();
        switch (num) {
            case 1:
                System.out.println("January:30");
                break;
            case 2:
                if ((year%400==0)||((year%4==0)&&(year%100!=0))){
                    n=29;
                }else{
                    n=28;
                }
                System.out.println("February:"+n);
            case 3:
                System.out.println("March:31");
                break;
            case 4:
                System.out.println("April:30");
                break;
            case 5:
                System.out.println("May:31");
                break;
            case 6:
                System.out.println("June:30");
                break;
            case 7:
                System.out.println("July:31");
                break;
            case 8:
                System.out.println("August:31");
                break;
            case 9:
                System.out.println("September:30");
                break;
            case 10:
                System.out.println("October:31");
                break;
            case 11:
                System.out.println("November:30");
                break;
            case 12:
                System.out.println("December:31");
                break;
            default:
                System.out.println("Invalid Input");
                break;


        }
    }
}
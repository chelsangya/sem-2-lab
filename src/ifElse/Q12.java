package ifElse;

import java.util.Scanner;
//Write a JAVA program to input month number and print number of days in that month.
public class Q12 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        int num,year,n;
        System.out.print("Enter the month number ");
        num = demo.nextInt();
        System.out.print("Enter the month number ");
        year= demo.nextInt();
        if (num==1){
            System.out.println("January:31");
        } else if (num==2){
            if ((year%400==0)||((year%4==0)&&(year%100!=0))){
                n=29;
            }else{
                n=28;
            }
            System.out.println("February:"+n);
        }else if (num==3){
            System.out.println("March:31");
        }else if (num==4){
            System.out.println("April:30");
        }else if (num==5){
            System.out.println("May:31");
        }else if (num==6){
            System.out.println("June:30");
        }else if (num==7){
            System.out.println("July:31");
        }else if (num==8){
            System.out.println("August:31");
        }else if (num==9){
            System.out.println("September:30");
        }else if (num==10){
            System.out.println("October:31");
        }else if (num==11){
            System.out.println("November:30");
        }else if (num==12){
            System.out.println("December:31");
        } else{
            System.out.println("Invalid Input");
        }


    }
}

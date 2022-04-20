package ifElse;

import java.util.Scanner;
//Write a JAVA program to input angles of a triangle and check whether triangle is valid or not.
public class Q14 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        int a1,a2,a3,sum;
        System.out.print("Enter the angle ");
        a1=demo.nextInt();
        System.out.print("Enter the angle ");
        a2= demo.nextInt();
        System.out.print("Enter the angle ");
        a3= demo.nextInt();
        sum=a1+a2+a3;
        if (sum==180){
            System.out.println("The triangle is valid.");
        } else{
            System.out.println("The triangle is not valid.");
        }
    }
}

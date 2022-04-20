package ifElse;

import java.util.Scanner;
//Write a JAVA program to input all sides of a triangle and check whether triangle is valid or not.
public class Q15 {
    public static void main(String[] args) {
        Scanner demo = new Scanner(System.in);
        int a1, a2, a3;
        System.out.print("Enter the side ");
        a1 = demo.nextInt();
        System.out.print("Enter the side ");
        a2 = demo.nextInt();
        System.out.print("Enter the side ");
        a3 = demo.nextInt();
        if ((a1 < (a2 + a3)) && (a2 < (a1 + a3)) && a3 < (a1 + a2)) {
            System.out.println("The triangle is valid.");
        } else{
            System.out.println("The triangle is not valid.");
        }
    }
}

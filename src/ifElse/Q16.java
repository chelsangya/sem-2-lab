package ifElse;

import java.util.Scanner;
//Write a JAVA program to check whether the triangle is equilateral, isosceles or scalene triangle.
public class Q16 {
    public static void main(String[] args) {
        Scanner demo = new Scanner(System.in);
        int a1, a2, a3;
        System.out.print("Enter the side ");
        a1 = demo.nextInt();
        System.out.print("Enter the side ");
        a2 = demo.nextInt();
        System.out.print("Enter the side ");
        a3 = demo.nextInt();
        if ((a1 == a2) && (a2 == a3)) {
            System.out.println("The triangle is equilateral.");
        } else if ((a1 == a2) || (a2 == a3) || (a3 == a1)) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is scalene.");
        }
    }
}

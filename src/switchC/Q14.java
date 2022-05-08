package switchC;

import java.util.Scanner;
//JAVA Program to check whether the triangle is an equilateral, isosceles or scalene triangle.
public class Q14 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        int a1, a2, a3,x;
        System.out.print("Enter the side ");
        a1 = demo.nextInt();
        System.out.print("Enter the side ");
        a2 = demo.nextInt();
        System.out.print("Enter the side ");
        a3 = demo.nextInt();
        if ((a1 == a2) && (a2 == a3)) {
            x=1;
        } else if ((a1 == a2) || (a2 == a3) || (a3 == a1)) {
            x=2;
        } else {
            x=3;
        }
        switch (x){
            case 1:
                System.out.println("The triangle is equilateral.");
                break;
            case 2:
                System.out.println("The triangle is isosceles.");
                break;
            default:
                System.out.println("The triangle is scalene.");
                break;
        }

    }
}

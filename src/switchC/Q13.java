package switchC;

import java.util.Scanner;
//JAVA Program to take the value from the user as input all sides of a triangle and check whether
//the triangle is valid or not.
public class Q13 {
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
        switch (sum){
            case 180:
                System.out.println("The triangle is valid.");
                break;
            default:
                System.out.println("The triangle is not valid.");
                break;
        }
    }
}

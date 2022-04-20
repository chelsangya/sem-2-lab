package ifElse;

import java.util.Scanner;
//Write a JAVA program to find maximum between two numbers.
public class Q1 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        int n1,n2;
        System.out.print("Enter the first number ");
        n1=demo.nextInt();
        System.out.print("Enter the second number ");
        n2=demo.nextInt();
        if (n1>n2){
            System.out.println(n1+" is the greatest number.");
        } else{
            System.out.println(n2+" is the greatest number.");
        };
   }
}

package usingScanner;

import java.util.Scanner;


public class Q11 {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        int n1,n2,n3;
        String result;
        System.out.print("Enter the first number ");
        n1= demo.nextInt();
        System.out.print("Enter the second number ");
        n2= demo.nextInt();
        System.out.print("Enter the third number ");
        n3=demo.nextInt();
        result=(n1==n2)&&(n2==n3)?"All numbers are equal":(n1==n2)||(n2==n3)||(n1==n3)?"Two numbers are equal":"None of the numbers are equal";
        System.out.println(result);
    }
}

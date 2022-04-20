package ifElse;

import java.util.Scanner;
//Write a JAVA program to find maximum between three numbers
public class Q2 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        int n1,n2,n3;
        System.out.print("Enter the first number ");
        n1=demo.nextInt();
        System.out.print("Enter the second number ");
        n2=demo.nextInt();
        System.out.print("Enter the third number ");
        n3= demo.nextInt();
        if (n1>=n2 && n1>=n3){
            System.out.println(n1+" is the greatest number.");
        } else if (n2>=n1 && n2>=n3) {
            System.out.println(n2+" is the greatest number.");
        } else {
            System.out.println(n3+" is the greatest number.");
    }
}
}

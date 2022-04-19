package usingScanner;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        int val,square;
        Scanner demo=new Scanner(System.in);
        System.out.print("Enter the number ");
        val= demo.nextInt();
        square=val*val;
        System.out.println("The square of the number is "+square);
    }
}

package usingScanner;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        String s1,s2;
        System.out.print("Enter the first string ");
        s1= demo.nextLine();
        System.out.print("Enter the second string ");
        s2=demo.nextLine();
        System.out.println(s1+s2);
    }
}

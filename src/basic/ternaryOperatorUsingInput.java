package basic;

import java.util.Scanner;
public class ternaryOperatorUsingInput {
    public static void main(String[] args) {
        Scanner demo = new Scanner(System.in);
        System.out.print("Enter the age ");
        int age = demo.nextInt();
        String eligibility;
        eligibility = age > 17 ? "You can basic.vote." : "You cannot basic.vote.";
        System.out.println(eligibility);
    }
}

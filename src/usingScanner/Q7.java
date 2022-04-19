package usingScanner;
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        String name,rollNo,interest;
        System.out.print("Name: ");
        name=demo.nextLine();
        System.out.print("Roll Number: ");
        rollNo=demo.nextLine();
        System.out.print("Field of Interest: ");
        interest=demo.nextLine();
        System.out.println("Hey, my name is "+name+" and my roll number is "+rollNo+". My field of interest are "+interest+".");
    }
}

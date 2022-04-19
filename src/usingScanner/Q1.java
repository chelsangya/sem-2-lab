package usingScanner;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
      Scanner demo= new Scanner(System.in);
      String name, rollNo, age, phoneNo;
      System.out.print("Enter the name: ");
      name=demo.nextLine();
      System.out.print("Enter the roll number: ");
      rollNo=demo.nextLine();
      System.out.print("Enter the age: ");
      age=demo.nextLine();
      System.out.print("Enter the phone number: ");
      phoneNo=demo.nextLine();
      System.out.println("Name:" + name + "\n Roll Number:" + rollNo + "\n Age:" + age + "\n Phone Number:" + phoneNo);
    }
}

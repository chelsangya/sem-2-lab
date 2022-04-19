package usingScanner;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        System.out.print("Enter the marks secured in Maths ");
        int maths= demo.nextInt();
        System.out.print("Enter the marks secured in Physics ");
        int physics=demo.nextInt();
        System.out.print("Enter the marks secured in Chemistry ");
        int chemistry=demo.nextInt();
        System.out.print("Enter the marks secured in Computer ");
        int computer=demo.nextInt();
        int total;
        total=maths+physics+chemistry+computer;
        double percentage;
        percentage=total/4;
        System.out.println("Total Marks:"+total+"\nPercentage: "+percentage+"%");
    }
}

package usingScanner;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner demo = new Scanner(System.in);
        int x, y, sum, pro;
        double div;
        System.out.print("Enter the first number ");
        x = demo.nextInt();
        System.out.print("Enter the second number ");
        y = demo.nextInt();
        sum = x + y;
        pro = x * y;
        div=pro/sum;
        System.out.println("Sum:" + sum + "\nProduct:" + pro+"\nDivision:"+div);
    }
}

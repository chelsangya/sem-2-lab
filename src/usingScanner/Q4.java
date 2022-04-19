package usingScanner;
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        int x,y,sum,pro;
        System.out.print("Enter the first number ");
        x=demo.nextInt();
        System.out.print("Enter the second number ");
        y=demo.nextInt();
        sum=x+y;
        pro=x*y;
        System.out.println("Sum:"+sum+"\nProduct:"+pro);
    }
}

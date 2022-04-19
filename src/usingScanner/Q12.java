package usingScanner;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        int a,b;
        String result;
        System.out.print("Enter the first number ");
        a= demo.nextInt();
        System.out.print("Enter the second number ");
        b= demo.nextInt();
        result=(a<50)&&(a<b)?"Conditions are fulfilled":"Conditions are not fulfilled";
        System.out.println(result);

    }
}

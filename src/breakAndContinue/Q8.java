package breakAndContinue;
import java.util.Scanner;
//Write a program to find the factorial value of any number entered through the
//keyboard.
public class Q8 {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        System.out.print("Enter the number ");
        int num= demo.nextInt();
        int fac=1;
        while (true){
            if (num<=1){
                break;
            }
            fac*=num;
            num-=1;
        }
        System.out.println("Factorial: "+fac);
    }
}

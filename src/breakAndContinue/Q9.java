package breakAndContinue;

import java.util.Scanner;

//Two numbers are entered through the keyboard. Write a program to find the value
//of one number raised to the power of another.
public class Q9 {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        System.out.print("Enter the number ");
        int num1 = demo.nextInt();
        System.out.print("Enter the power ");
        int num2= demo.nextInt();
        int p=1;
        while (true){
            if(num2==0){
                break;
            }
            p*=num1;
            num2-=1;
        }
        System.out.println("The answer: "+ p);
    }
}

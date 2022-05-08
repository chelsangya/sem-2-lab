package breakAndContinue;

import java.util.Scanner;

//Write a program that prompts the user to input an integer and then outputs the
//number with the digits reversed. For example, if the input is 12345, the output
//should be 54321
public class Q10 {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        System.out.print("Enter the number ");
        int num= demo.nextInt();
        int rev=0,temp;
        while (true){
            if (num<=0){
                break;
            }
            temp=num%10;
            rev=(rev*10)+temp;
            num/=10;
        }
        System.out.println("Reverse: "+rev);
    }
}

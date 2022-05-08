package breakAndContinue;

import java.util.Scanner;

//Write a program that reads a set of integers, and then prints the sum of the even
//and odd integers.
public class Q11 {
    public static void main(String[] args) {
        Scanner demo = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = demo.nextInt();
        int e = 0,o=0, temp;
        while (true) {
            if (num <= 0) {
                break;
            }
            temp = num % 10;
            if(temp%2==0){
                e+=1;
            }else {
                o+=1;
            }
            num /= 10;
        }
        System.out.println("Number of Odd Numbers: "+o);
        System.out.println("Number of Even Numbers:"+e);
    }
}

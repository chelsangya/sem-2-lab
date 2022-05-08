package breakAndContinue;

import java.util.Scanner;

//Write a program to print Fibonacci series of n terms where n is input by user :
//0 1 1 2 3 5 8 13 24 .....
public class Q18 {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        System.out.print("Enter the terminating number ");
        int a=0,b=1,c=0,num;
        num=demo.nextInt();
        System.out.print(a+" "+b);
        c=a+b;
        while (num>=c){
            System.out.print(" "+c);
            a=b;
            b=c;
            c=a+b;
        }

    }

}

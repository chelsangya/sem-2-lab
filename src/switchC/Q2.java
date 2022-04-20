package switchC;

import java.util.Scanner;
//JAVA Program to find the maximum between two numbers
public class Q2 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        int n1,n2,x;
        System.out.print("Enter the first number ");
        n1=demo.nextInt();
        System.out.print("Enter the second number ");
        n2=demo.nextInt();
        if (n1>n2){
            x=1;
        } else{
            x=2;
        };
        switch (x){
            case 1:
                System.out.println(n1+" is the greatest number.");
                break;
            default:
                System.out.println(n2+" is the greatest number.");
                break;
        }


    }
}

package breakAndContinue;

import java.util.Scanner;

//Write a program to enter the numbers till the user wants and at the end the
//program should display the largest and smallest numbers entered.
public class Q16 {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        char ans;
        int num;
        int s=Integer.MAX_VALUE;
        int g=Integer.MIN_VALUE;
        while (true){
            System.out.println("Enter the number ");
            num= demo.nextInt();
            if (g<num){
                g=num;
            }
            if (s>num){
                s=num;
            }
            System.out.println("Press 'Y' to continue ");
            ans=demo.next().charAt(0);
            if(Character.toUpperCase(ans)!='Y'){
                break;
            }
        }
        System.out.println("Largest number: " + g);
        System.out.println("Smallest number: " + s);
    }
}

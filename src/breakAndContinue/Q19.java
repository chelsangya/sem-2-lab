package breakAndContinue;

import java.util.Scanner;

//Write a program to calculate the sum of following series where n is input by user.
//1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
public class Q19 {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        System.out.print("Enter the terminating number ");
        int num= demo.nextInt();
        double temp=1;
        double sum=0.0;
        while (true){
            if (temp>num){
                break;
            }
            sum=sum+(1/temp);
            temp+=1;
        }

        System.out.println("Sum of the series: "+sum);
    }
}

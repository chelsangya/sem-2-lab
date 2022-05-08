package breakAndContinue;

import java.util.Scanner;

//Compute the natural logarithm of 2, by adding up to n terms in the series
//1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
//where n is a positive integer and input by user
public class Q20 {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        System.out.print("Enter the terminating number ");
        int num= demo.nextInt();
        double temp=1,sum=0,frac=0;
        while (true){
            if (temp>num){
                break;
            }
            if (temp%2!=0){
                frac=1/temp;
            }else{
                frac=-(1/temp);
            }
            sum+=frac;
           temp+=1;
        }
        System.out.println("Sum: "+sum);
    }
}

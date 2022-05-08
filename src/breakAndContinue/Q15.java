package breakAndContinue;

import java.util.Scanner;

//Write a program to enter the numbers till the user wants and at the end it should
//display the count of positive, negative and zeros entered.
public class Q15 {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        char ans;
        int num,neg=0,pos=0,zero=0;
        while (true){
            System.out.println("Enter the number ");
            num= demo.nextInt();
            if(num==0){
                zero+=1;
            } else if (num>0) {
                pos+=1;
            } else {
                neg+=1;
            }
            System.out.println("Press 'Y' to continue ");
            ans=demo.next().charAt(0);
            if(Character.toUpperCase(ans)!='Y'){
                break;
            }
        }
        System.out.println("Negative: "+neg+" Positive: "+pos+" Zero: "+zero);
    }
}

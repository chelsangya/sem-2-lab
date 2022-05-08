package breakAndContinue;
import java.util.Scanner;
//Write a program to calculate HCF of Two given number.
public class Q13 {
    public static void main(String[] args) {
        int i=1, hcf = 0;
        Scanner demo= new Scanner(System.in);
        System.out.println("Enter the number ");
        int num1= demo.nextInt();
        System.out.println("Enter the number ");
        int num2= demo.nextInt();
        while(true){
            if (i>num1||i>num2){
                break;
            }
            if( num1%i == 0 && num2%i == 0 ){
                hcf = i;
            }
            i++;
        }

        System.out.println("The H.C.F.: "+hcf);
    }
}

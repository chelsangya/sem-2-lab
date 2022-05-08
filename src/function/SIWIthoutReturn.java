package function;

import java.util.Scanner;

public class SIWIthoutReturn {
    public static void main(String[] args) {
        SIWIthoutReturn function=new SIWIthoutReturn();
        function.simpleInterest();
    }
    public void simpleInterest(){
        Scanner demo= new Scanner(System.in);
        System.out.print("Enter the principal ");
        int p=demo.nextInt();
        System.out.print("Enter the rate ");
        int r=demo.nextInt();
        System.out.print("Enter the time ");
        int t=demo.nextInt();
        int SI=(p*t*r)/100;
        System.out.println("Simple Interest: "+SI);
    }
}

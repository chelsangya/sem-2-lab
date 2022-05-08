package function;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        SimpleInterest function=new SimpleInterest();
        Scanner demo= new Scanner(System.in);
        System.out.print("Enter the principal ");
        int p=demo.nextInt();
        System.out.print("Enter the rate ");
        int r=demo.nextInt();
        System.out.print("Enter the time ");
        int t=demo.nextInt();
        int SI= function.simpleInterest(p,t,r);
        System.out.println("Simple Interest: "+SI);
    }
    public int simpleInterest(int p,int t,int r){
        int SI=(p*t*r)/100;
        return SI;

    }
}


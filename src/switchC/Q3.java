package switchC;

import java.util.Scanner;
//JAVA Program to find the maximum between three numbers
public class Q3 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        int n1,n2,n3,x;
        System.out.print("Enter the first number ");
        n1=demo.nextInt();
        System.out.print("Enter the second number ");
        n2=demo.nextInt();
        System.out.print("Enter the third number ");
        n3= demo.nextInt();
        if (n1>=n2 && n1>=n3){
            x=1;

        } else if (n2>=n1 && n2>=n3) {
            x=2;
        } else {
            x=3;
        }
        switch (x){
            case 1:
                System.out.println(n1+" is the greatest number.");
                break;
            case 2:
                System.out.println(n2+" is the greatest number.");
                break;
            default:
                System.out.println(n3+" is the greatest number.");
                break;

        }
    }
}

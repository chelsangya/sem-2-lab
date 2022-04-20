package ifElse;

import java.util.Scanner;
//Write a JAVA program to find all roots of a quadratic equation.
public class Q17 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        double r1, r2,a,b,c,determinant,sqrt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a ::");
        a= sc.nextDouble();
        System.out.println("Enter the value of b ::");
        b= sc.nextDouble();
        System.out.println("Enter the value of c ::");
        c = sc.nextDouble();
        determinant = (b*b)-(4*a*c);
        sqrt = Math.sqrt(determinant);
        if(determinant>0){
            r1 = (-b + sqrt)/(2*a);
            r2 = (-b - sqrt)/(2*a);
            System.out.println("Roots are :: "+ r1 +" and "+r2);
        }else if(determinant == 0){
            System.out.println("Root is :: "+(-b + sqrt)/(2*a));
        }
    }
}

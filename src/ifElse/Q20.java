package ifElse;

import java.util.Scanner;
// Write a JAVA program to input basic salary of an employee and calculate its Gross salary
//according to following:
//Basic Salary <= 10000 : HRA = 20%, DA = 80%
//Basic Salary <= 20000 : HRA = 25%, DA = 90%
//Basic Salary > 20000 : HRA = 30%, DA = 95%
public class Q20 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        double da,hra,basic,gross;
        System.out.print("Enter the basic salary ");
        basic= demo.nextDouble();
        if(basic <= 10000)
        {
            da  = basic * 0.8;
            hra = basic * 0.2;
        }
        else if(basic <= 20000)
        {
            da  = basic * 0.9;
            hra = basic * 0.25;
        }
        else
        {
            da  = basic * 0.95;
            hra = basic * 0.3;
        }
        gross = basic + hra + da;
        System.out.println("The gross salary is Rs."+gross);
    }
}

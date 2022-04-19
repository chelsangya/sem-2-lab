package basic;

import java.util.Scanner;
public class resultWithInput {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        System.out.print("Enter the marks secured in Maths ");
        int maths= demo.nextInt();
        System.out.print("Enter the marks secured in Physics ");
        int physics=demo.nextInt();
        System.out.print("Enter the marks secured in Chemistry ");
        int chemistry=demo.nextInt();
        System.out.print("Enter the marks secured in Computer ");
        int computer=demo.nextInt();
        int total;
        total=maths+physics+chemistry+computer;
        double percentage;
        percentage=total/4;
        String division;
        division= percentage>=70? "First Class": percentage>59? "Upper Second Class": percentage>49? "Second Class": percentage>39?"Third Class":"Fail";
        System.out.print("Total Marks: ");
        System.out.println(total);
        System.out.print("Percentage: ");
        System.out.println(percentage);
        System.out.print("Result: ");
        System.out.println(division);
    }
}

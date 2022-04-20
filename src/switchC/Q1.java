package switchC;

import java.util.Scanner;
//Using switch statement Write a JAVA program to input marks of five subjects Physics,
//Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to
//following:
//Percentage >= 90% : Grade A
//Percentage >= 80% : Grade B
//Percentage >= 70% : Grade C
//Percentage >= 60% : Grade D
//Percentage >= 40% : Grade E
//Percentage < 40% : Grade F
public class Q1 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        int maths,physics,computer,chemistry,biology,total,percentage,avg;
        String grade;
        System.out.print("Enter the marks secured in Maths ");
        maths= demo.nextInt();
        System.out.print("Enter the marks secured in Physics ");
        physics=demo.nextInt();
        System.out.print("Enter the marks secured in Chemistry ");
        chemistry=demo.nextInt();
        System.out.print("Enter the marks secured in Biology ");
        biology=demo.nextInt();
        System.out.print("Enter the marks secured in Computer ");
        computer=demo.nextInt();
        total=maths+physics+chemistry+computer+biology;
        percentage=total/5;
        avg=percentage/10;
        switch (avg){
            case 10:
                grade="A";
                break;
            case 9:
                grade="A";
                break;
            case 8:
                grade="B";
                break;
            case 7:
                grade="C";
                break;
            case 6:
                grade="D";
                break;
            case 4:
                grade="E";
                break;
            default:
                grade="F";
                break;
        }
        System.out.println("Percentage: "+percentage+"%\nGrade: "+grade);
    }
}

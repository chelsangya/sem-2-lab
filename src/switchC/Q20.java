package switchC;

import java.util.Scanner;
//Write a program that determines a student’s grade. The program will read three types of scores
//(quiz, mid-term, and final scores) and determine the grade based on the following rules:if the
//average score =90% =>grade=A…………………..-if the average score >= 70% and <90% =>
//grade=B……………………-if the average score>=50% and <70%
//=>grade=C……………………..-if the average score<50% =>grade=F
public class Q20 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        int mid,quiz,finalm,total,percentage,avg;
        char grade;
        System.out.print("Midterm Marks:");
        mid= demo.nextInt();
        System.out.println("Quiz Marks:");
        quiz= demo.nextInt();
        System.out.println("Final Marks");
        finalm= demo.nextInt();
        total=mid+quiz+finalm;
        percentage=total/3;
        avg=percentage/10;
        switch (avg){
            case 10,9:
                grade='A';
                break;
            case 8,7:
                grade='B';
                break;
            case 6,5:
                grade='C';
                break;
            default:
                grade='F';
                break;
        }
        System.out.println("Percentage: "+percentage+"%\nGrade: "+grade);
    }
}

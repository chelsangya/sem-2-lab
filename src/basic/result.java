package basic;

public class Result {
//    Write a program to calculate the total marks of four subjects of a student and the total
//    percentage secured. And use following conditions to generate the final basic.result;
//    a. If equal to or more than 70 -> First Class
//    b. If more than 59 -> Upper second Class
//    c. If more than 49 -> Second class
//    d. If more than 39 -> Third class and if below than 40 the basic.result is fail.
public static void main(String[] args) {
    int maths=70;
    int physics=59;
    int chemistry=87;
    int computer=44;
    int total;
    total=maths+physics+chemistry+computer;
    double percentage;
    percentage=total/4;
    String division;
    division= percentage>=70? "First Class": percentage>59? "Upper Second Class": percentage>49? "Second Class": percentage>39?"Third Class":"Fail";
    System.out.println("Total Marks");
    System.out.println(total);
    System.out.println("Percentage");
    System.out.println(percentage);
    System.out.println("Result");
    System.out.println(division);
}
}

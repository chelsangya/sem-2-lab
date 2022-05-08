package breakAndContinue;
import java.util.Scanner;

//Write a program that prompts the user to input a positive integer. It should then
//print the multiplication table of that number.
public class Q7 {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        System.out.print("Enter the number ");
        int num= demo.nextInt();
        int i=1,p;
        while (true){
            if (i==11){
                break;
            }
            p=i*num;
            System.out.println(num+"*"+i+"="+p);
            i++;
        }

    }
}

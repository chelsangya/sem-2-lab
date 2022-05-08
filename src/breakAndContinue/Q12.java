package breakAndContinue;

import java.util.Scanner;

//Write a program that prompts the user to input a positive integer. It should then
//output a message indicating whether the number is a prime number.
public class Q12 {
    public static void main(String[] args) {
        Scanner demo = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = demo.nextInt();
        int flag=0;
        for (int i=2;i<num;i++){
            if (num%i==0){
                flag=1;
                break;
            }
        }
        if (flag==1){
            System.out.println(num+ " is a composite number.");
        }else{
            System.out.println(num+ " is a prime number.");
        }
    }

}

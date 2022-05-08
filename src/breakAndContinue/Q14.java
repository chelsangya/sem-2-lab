package breakAndContinue;
import java.util.Scanner;
//Write a do-while loop that asks the user to enter two numbers. The numbers
//should be added and the sum displayed. The loop should ask the user whether he
//or she wishes to perform the operation again. If so, the loop should repeat;
//otherwise it should terminate.
public class Q14 {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        char ans;
        int num1,num2,sum;
        do{
            System.out.print("Enter the number ");
            num1=demo.nextInt();
            System.out.print("Enter the number ");
            num2=demo.nextInt();
            sum=num1+num2;
            System.out.println("The sum: "+sum);
            System.out.println("Press 'Y' to continue for next set of numbers");
            ans=demo.next().charAt(0);
            if(Character.toUpperCase(ans)!='Y'){
                break;
            }
        } while(true);
    }
}

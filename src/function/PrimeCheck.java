package function;
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        PrimeCheck function=new PrimeCheck();
        Scanner demo= new Scanner(System.in);
        System.out.print("Enter the number");
        int n= demo.nextInt();
        function.primeCheck(n);
    }
    public void primeCheck(int num){
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

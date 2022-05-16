package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

//WAP to create a function which accepts the arraylist of integer of size 10 as
//parameter and return the sum of prime numbers present in it.
public class SumOfPrime {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        ArrayList<Integer> array= new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            System.out.print("Enter the number ");
            int num= demo.nextInt();
            array.add(num);
        }
      int total=  sumOfPrimeNumbers(array);
        System.out.println("The sum of prime numbers: "+ total);
    }
    public static int sumOfPrimeNumbers(ArrayList<Integer> num){
        int sum=0;
        for (int i=0; i<num.size();i++){
            int value=num.get(i);
            int flag=0;
            for (int j=2;j<value;j++){
                if (value%j==0){
                    flag=1;
                    break;
                }
            }
            if ((flag==0)&&(value>1)){
                sum+=value;
            }
        }
        return sum;
    }
}


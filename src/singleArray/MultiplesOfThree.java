package singleArray;
import java.util.Scanner;

//WAP to print multiples of 3 present in a user defined array of size 10 using function.
public class MultiplesOfThree {
    public static void main(String[] args) {
        printMultiples();
    }
    public static void printMultiples(){
        Scanner demo=new Scanner(System.in);
        int [] mul= new int[10];
        for (int i=0;i<10;i++){
            System.out.print("Enter the number ");
            int value= demo.nextInt();
            mul[i]=value;
        }
        for (int j=0;j<10;j++){
            if(mul[j]%3==0){
                System.out.println(mul[j]);
            }
        }
}
}

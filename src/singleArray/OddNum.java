package singleArray;
import java.util.Arrays;
import java.util.Scanner;


//WAP to create an array with odd numbers typed in a loop of 10 user inputs.
public class OddNum {
    public static void main(String[] args) {
        oddNum();
    }
    public static void oddNum(){
        int [] array = new int[10];
        int n=0;
        Scanner demo2= new Scanner(System.in);
        for (int i=0;i<10;i++){
            System.out.print("Enter the number");
            int x= demo2.nextInt();
            array[i]=x;
            if (x%2!=0){
                n++;
            }
        }
        int c=0;
        int [] array2= new int[n];
        for (int j=0;j<10;j++){
            if (array[j]%2!=0){
                array2[c]=array[j];
                c++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }

}

package MultiArray;

import java.util.Scanner;

//Write a Java Program to find min and max value in an array.
public class MinMax {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        int row=2,column=3;
        int[][] array1= new int[row][column];
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print("Enter the number ");
                array1[i][j]= demo.nextInt();
            }
        }
        minAndMax(array1,row,column);
    }
    public static void minAndMax(int[][] array,int row,int column){
        int max= Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=0; i<row;i++){
            for (int j=0;j<column;j++){
                int val=array[i][j];
                if (val>max){
                    max=val;
                }
                if (val<min){
                    min=val;
                }
            }
        }
        System.out.println("The maximum value: "+max);
        System.out.println("The minimum value: "+min);
    }
}

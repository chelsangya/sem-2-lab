package MultiArray;
import java.util.Arrays;
import java.util.Scanner;

//Write a Java Program to multiply two 2x3 matrices.
public class MultiplyTwoMatrices {
    public static void main(String[] args) {
       multiplication();
    }

    public static void multiplication(){
        Scanner demo= new Scanner(System.in);
        int row=2,column=3;
        int[][] array1= new int[row][column];
        int[][] array2= new int[row][column];
        int[][] array3= new int[row][column];
        System.out.println("For Array 1:");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print("Enter the number ");
                array1[i][j]= demo.nextInt();
            }
        }
        System.out.println("For Array 2:");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print("Enter the number ");
                array2[i][j]= demo.nextInt();
            }
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                array3[i][j]= array1[i][j]*array2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(array1)+" x "+Arrays.deepToString(array2)+" = "+Arrays.deepToString(array3));
    }
}

package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

//WAP to sort the integer elements of array of size 10 in ascending and descending
//order.
public class SortedArrayList {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        ArrayList<Integer> array= new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            System.out.print("Enter the number ");
            int num= demo.nextInt();
            array.add(num);
        }
        System.out.println("Original Array: "+array);
        ascendingSort(array);
        descendingSort(array);
    }
    public static void ascendingSort(ArrayList<Integer> array){
        int a,b,len= array.size();
        for (int i=0;i< len;i++){
            for (int j=0;j< len-i-1;j++){
                a= array.get(j);
                b= array.get(j+1);
                if (a>b){
                    array.set(j,b);
                    array.set(j+1,a);
                }
            }
        }
        System.out.println("Ascending Order: "+array);
    }

    public static void descendingSort(ArrayList<Integer> array){
        int a,b,len= array.size();
        for (int i=0;i< len;i++){
            for (int j=0;j< len-i-1;j++){
                a= array.get(j);
                b= array.get(j+1);
                if (a<b){
                    array.set(j,b);
                    array.set(j+1,a);
                }
            }
        }
        System.out.println("Descending Order: "+array);
    }
}

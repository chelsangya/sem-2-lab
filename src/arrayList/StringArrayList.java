package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

//Write code that creates an ArrayList that can hold string objects. Add the names of
//three cars to the ArrayList, and then display the contents of the ArrayList.
public class StringArrayList {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        ArrayList<String> array= new ArrayList<String>();
        for (int i=0;i<3;i++){
            System.out.print("Enter the car model ");
            String value= demo.nextLine();
            array.add(value);
        }
        System.out.println("The names of car inserted:");
        for (int i=0;i< array.size();i++){
            System.out.println(array.get(i));
        }
    }
}

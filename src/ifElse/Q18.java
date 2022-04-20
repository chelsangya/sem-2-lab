package ifElse;

import java.util.Scanner;
// Write a JAVA program to calculate profit or loss.
public class Q18 {
    public static void main(String[] args) {
        Scanner demo = new Scanner(System.in);
        double SP, CP,val;
        System.out.print("Enter the cost price ");
        CP = demo.nextDouble();
        System.out.print("Enter the selling price ");
        SP = demo.nextDouble();
        if (SP > CP) {
            val=SP-CP;
            System.out.println("Profit: "+val);
        } else {
            val=CP-SP;
            System.out.println("Loss:"+val);
        }
    }
}

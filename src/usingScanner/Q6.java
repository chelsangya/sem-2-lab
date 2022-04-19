package usingScanner;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        double l,b,area;
        System.out.print("Length: ");
        l=demo.nextDouble();
        System.out.print("Breadth: ");
        b=demo.nextDouble();
        area=l*b;
        int castedArea=(int)(area);
        System.out.println(castedArea);
    }
}

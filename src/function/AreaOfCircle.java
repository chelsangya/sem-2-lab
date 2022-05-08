package function;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        AreaOfCircle demo= new AreaOfCircle();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the radius");
        int rad=scanner.nextInt();
        float areaC=demo.area(rad);
        System.out.println("The area of the circle: "+areaC);
    }
    public float area(int r){
        float ar= (44*r*r)/7;
        return ar;
    }
}

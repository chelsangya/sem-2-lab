package usingScanner;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        int l,l2,area,perimeter,vol1,principal,rate,time,SI,len1,ht,area2,len2,br,vol2,ht2;
        System.out.print("Enter the side of a square: ");
        l=demo.nextInt();
        area=l*l;
        perimeter=4*l;
        System.out.println("Area:"+area+"\nPerimeter:"+perimeter);
        System.out.print("Enter the side of a cube: ");
        l2=demo.nextInt();
        vol1=l2*l2*l2;
        System.out.println("Volume:"+vol1 );
        System.out.print("Enter the principal: ");
        principal=demo.nextInt();
        System.out.print("Enter the time: ");
        time=demo.nextInt();
        System.out.print("Enter the rate: ");
        rate= demo.nextInt();
        SI=(principal*time*rate)/100;
        System.out.println("Simple Interest:"+SI);
        System.out.print("Enter the length of the triangle: ");
        len1= demo.nextInt();
        System.out.print("Enter the height of the triangle: ");
        ht= demo.nextInt();
        area2=(len1*ht)/2;
        System.out.println("Area of the triangle: "+area2);
        System.out.print("Enter the length of the cuboid: ");
        len2= demo.nextInt();
        System.out.print("Enter the breadth of the cuboid: ");
        br= demo.nextInt();
        System.out.print("Enter the height of the cuboid: ");
        ht2= demo.nextInt();
        vol2=len2*br*ht2;
        System.out.println("Volume of the Cuboid: "+vol2);
    }
}

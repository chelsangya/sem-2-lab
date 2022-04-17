import java.util.Scanner;
public class calculationsWithInput {
    public static void main(String[] args) {
        Scanner demo1=new Scanner(System.in);
        System.out.print("Enter the principal ");
        int principal=demo1.nextInt();
        System.out.print("Enter the rate ");
        int rate=demo1.nextInt();
        System.out.print("Enter the time ");
        int time=demo1.nextInt();
        int simpleInterest;
        simpleInterest = principal * rate * time;
        System.out.print("Simple Interest ");
        System.out.println(simpleInterest);
        System.out.print("Enter the breadth of the triangle ");
        int b=demo1.nextInt();
        System.out.print("Enter the height of the triangle ");
        int h=demo1.nextInt();
        double area=0.5*b*h;
        System.out.print("The area of the triangle ");
        System.out.println(area);
        System.out.print("Enter the length of the cube ");
        int l=demo1.nextInt();
        int vol=l^3;
        System.out.print("The volume of the cube ");
        System.out.println(vol);
        System.out.print("Enter the length of the cuboid ");
        int ln=demo1.nextInt();
        System.out.print("Enter the breadth of the cuboid ");
        int br=demo1.nextInt();
        System.out.print("Enter the height of the cuboid ");
        int ht=demo1.nextInt();
        int volume=ln*br*ht;
        System.out.print("The volume of the cuboid ");
        System.out.println(volume);
    }
}

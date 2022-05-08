package function;

import java.util.Scanner;

public class MultiplyThreeNumbers {
    public static void main(String[] args) {
        int pro;
        MultiplyThreeNumbers demo=new MultiplyThreeNumbers();
        pro=demo.product();
        System.out.println("The product: "+pro);

    }
    public int product(){
        Scanner demo= new Scanner(System.in);
        int p=1;
        for (int i=1;i<4;i++){
        System.out.println("Enter the number ");
        int x= demo.nextInt();
        p*=x;
        }
        return p;
    }
}


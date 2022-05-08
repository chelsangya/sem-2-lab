package breakAndContinue;
import java.util.Scanner;

//WAP to display multiplication table of a given no.
public class Q5 {
    public static void main(String[] args) {
        int num= 9;
        int i=1,p;
        while (true){
            if (i==11){
                break;
            }
            p=i*num;
            System.out.println(num+"*"+i+"="+p);
            i++;
        }
    }
}


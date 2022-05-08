package breakAndContinue;
//Write a program to print numbers from 1 to 10.
public class Q1
{
    public static void main(String[] args) {
        int c=1;
        while (true){
            if (c>10){
                break;
            }
            System.out.println(c);
            c++;
        }
    }
}

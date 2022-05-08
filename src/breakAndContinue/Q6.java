package breakAndContinue;
//Write a program to calculate the sum of first 10 natural number.
public class Q6 {
    public static void main(String[] args) {
        int sum=0,i=1;
        while (true) {
            if (i==11){
                break;
            }
            sum+=i;
            i++;
        }
        System.out.println("The sum: "+sum);
    }
}

package breakAndContinue;
//Write a program to print out all Armstrong numbers between 1 and 500. If sum of
//cubes of each digit of the number is equal to the number itself, then the number is
//called an Armstrong number.
//For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
public class Q17 {
    public static void main(String[] args) {
    int temp,result,rem,i=1;
        System.out.println("Armstrong numbers between 1 to 500 are");
       while(i<500){
             temp=i;
             result=0;
            while (temp>0){
                rem=temp%10;
                result=result+(rem*rem*rem);
                temp/=10;
            }
           if (result!=i){
             i++;
             continue;
           }
           System.out.println(i);
           i++;
        }

    }
}

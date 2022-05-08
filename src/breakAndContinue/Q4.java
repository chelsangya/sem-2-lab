package breakAndContinue;
//WAP to display no. of even and no. of odd number between 10 and 30.
public class Q4 {
    public static void main(String[] args) {
        int e=0,o=0,i=11;
        while(true){
            if (i==30){
                break;
            }
            if (i%2==0){
                e+=1;
            } else {
                o+=1;
            }
            i++;
        }
        System.out.println("Number of Odd Numbers: "+o);
        System.out.println("Number of Even Numbers:"+e);
    }
}

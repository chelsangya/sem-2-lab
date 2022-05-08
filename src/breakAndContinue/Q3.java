package breakAndContinue;
//WAP to display the number of even numbers between 10 and 30.
public class Q3 {
    public static void main(String[] args) {
        int c=0;
        for(int i=11;i<29;i++){
            if (i%2!=0){
                continue;
            }
            c+=1;
        }
        System.out.println("Number of Even Numbers: "+c);
}}

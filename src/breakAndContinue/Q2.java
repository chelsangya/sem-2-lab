package breakAndContinue;
//WAP to display even number between 10 and 30.
public class Q2 {
    public static void main(String[] args) {
        for(int i=11;i<29;i++){
            if (i%2!=0){
                continue;
            }
            System.out.println(i);
        }
    }
}

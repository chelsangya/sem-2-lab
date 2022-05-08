package breakAndContinue;
//Print patterns
public class Q22 {
    public static void main(String[] args) {
//        i();
//        ii();
        iii();
//        iv();
//        v();
//        vi();
    }
    public static void i(){
        int i=1,j;
        while(true){
            j=1;
            if(i==5){
                break;
            }
            while(true){
                if(j==11){
                    break;
                }
                System.out.print("*"+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void ii(){
        int i=1,j;
        while(true){
            j=1;
            if(i==6){
                break;
            }
            while(true){
                if(j>i){
                    break;
                }
                System.out.print("*"+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void iii(){
      
    }

    public static void iv(){
        int i=0, j;
        while(true) {
            if(i==5){
                break;
            }
            j=6-i;
            while(true) {
                if(j<=1){
                    break;
                }
                System.out.print(" ");
                j--;
            }
            j=0;
          while(true) {
                if (j>i){
                    break;
                }
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void v(){
        int i=0,j;
        while(true) {
            if(i==5){
                break;
            }
            j=6-i;
            while(true) {
                if(j<=1){
                    break;
                }
                System.out.print(" ");
                j--;
            }
            j=0;
            while(true) {
                if (j>i){
                    break;
                }
                System.out.print(i+1+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void vi(){

    }
}

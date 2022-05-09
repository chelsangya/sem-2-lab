package breakAndContinue;
//Print patterns
public class Q22 {
    public static void main(String[] args) {
        Q22 demo= new Q22();
        System.out.println("Pattern 1:");
        demo.i();
        System.out.println("\nPattern 2:");
       demo.ii();
        System.out.println("\nPattern 3:");
        demo.iii();
        System.out.println("\nPattern 4:");
        demo.iv();
        System.out.println("\nPattern 5:");
       demo.v();
        System.out.println("\nPattern 6:");
       demo.vi();
    }
    public void i(){
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

    public void ii(){
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

    public void iii(){
        int i=0,j;
        while(true)
        {
            if(i==5){
                break;
            }
            j=(5-i)*2;
          while(true)
            {
                if (j<0){
                    break;
                }
                System.out.print(" ");
                j--;
            }
          j=0;
          while(true)
            {
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

    public void iv(){
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

    public void v(){
        int i=0,j,x;
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
                x=i+1;
                System.out.print(x+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public void vi(){
        int i=1;
        while(true) {
            if(i>5){
                break;
            }
            int n = 8;
            int j=1;
            while (true) {
                if (j>(n-i)){
                    break;
                }
                System.out.print(" ");
                j++;
            }
            int k=i;
            while (true) {
                if (k<1){
                    break;
                }
                System.out.print(k);
                k--;
            }
            int l=2;
           while (true) {
                if(l>i){
                    break;
                }
                System.out.print(l);
                l++;
            }
            System.out.println();
           i++;
        }
    }
}


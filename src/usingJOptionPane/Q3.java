package usingJOptionPane;
import javax.swing.*;

public class Q3 {
    public static void main(String[] args) {
        int maths,chem,phy,comp,total;
        double percentage;
        String result;
       maths= Integer.parseInt(JOptionPane.showInputDialog("Enter your marks in maths"));
       chem= Integer.parseInt(JOptionPane.showInputDialog("Enter your marks in chemistry"));
       phy= Integer.parseInt(JOptionPane.showInputDialog("Enter your marks in physics"));
       comp= Integer.parseInt(JOptionPane.showInputDialog("Enter your marks in computer"));
       total=maths+chem+phy+comp;
       percentage=total/4;
       result=percentage>69?"First Class":percentage>59?"Upper Second Class":percentage>49?"Second Class":percentage>39?"Third Class":"Fail";
       JOptionPane.showMessageDialog(null,"Total marks:"+total+"\nPercentage:"+percentage+"%"+"\n Result:"+result);
    }
}

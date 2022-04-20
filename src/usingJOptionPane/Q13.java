package usingJOptionPane;
import javax.swing.*;
public class Q13 {
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
        JOptionPane.showMessageDialog(null,"Total Marks: "+total+"\nPercentage: "+percentage+"%");
    }
}

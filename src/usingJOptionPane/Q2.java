package usingJOptionPane;
import javax.swing.*;

public class Q2 {
    public static void main(String[] args) {
        int n1,n2,n3,n4,sum;
        n1=Integer.parseInt(JOptionPane.showInputDialog("Enter the first number:"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Enter the second number:"));
        n3=Integer.parseInt(JOptionPane.showInputDialog("Enter the third number:"));
        n4=Integer.parseInt(JOptionPane.showInputDialog("Enter the fourth number:"));
        sum=n1+n2+n3+n4;
        JOptionPane.showMessageDialog(null,"The sum is: "+sum);
    }
}

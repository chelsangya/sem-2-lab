package usingJOptionPane;

import javax.swing.*;

public class Q4 {
    public static void main(String[] args) {
        int x,y,sum,pro;
        x=Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));
        sum=x+y;
        pro=x*y;
        JOptionPane.showMessageDialog(null,"Sum:"+sum+"\nProduct:"+pro);
    }
}

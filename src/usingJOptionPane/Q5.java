package usingJOptionPane;

import javax.swing.*;

public class Q5 {
    public static void main(String[] args) {
        int x,y,sum,pro;
        double div;
        x=Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));
        sum=x+y;
        pro=x*y;
        div=pro/sum;
        JOptionPane.showMessageDialog(null,"Sum:"+sum+"\nProduct:"+pro+"\nDivision:"+div);
    }
}

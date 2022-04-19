package usingJOptionPane;

import javax.swing.*;

public class Q11 {
    public static void main(String[] args) {
        int n1,n2,n3;
        String result;
        n1=Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));
        n3=Integer.parseInt(JOptionPane.showInputDialog("Enter the third number"));
        result=(n1==n2)&&(n2==n3)?"All numbers are equal":(n1==n2)||(n2==n3)||(n1==n3)?"Two numbers are equal":"None of the numbers are equal";
        JOptionPane.showMessageDialog(null,result);
    }

}

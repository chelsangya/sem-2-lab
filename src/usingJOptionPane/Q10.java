package usingJOptionPane;

import javax.swing.*;

public class Q10 {
    public static void main(String[] args) {
        String s1,s2;
        s1= JOptionPane.showInputDialog("Enter the first number");
        s2= JOptionPane.showInputDialog("Enter the second number");
        JOptionPane.showMessageDialog(null,s1+s2);
    }
}

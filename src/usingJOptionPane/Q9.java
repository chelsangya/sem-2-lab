package usingJOptionPane;

import javax.swing.*;

public class Q9 {
    public static void main(String[] args) {
        int val,square;
        val= Integer.parseInt(JOptionPane.showInputDialog("Enter the number"));
        square=val*val;
        JOptionPane.showMessageDialog(null,square);
    }
}

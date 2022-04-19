package usingJOptionPane;

import javax.swing.*;

public class Q12 {
    public static void main(String[] args) {
        int a,b;
        String result;
        a=Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));
        result=(a<50)&&(a<b)?"Conditions are fulfilled":"Conditions are not fulfilled";
        JOptionPane.showMessageDialog(null,result);
    }
}

package usingJOptionPane;

import javax.swing.*;

public class Q6 {
    public static void main(String[] args) {
    double l, b, area;
    l=Double.parseDouble(JOptionPane.showInputDialog("Enter the length"));
    b=Double.parseDouble(JOptionPane.showInputDialog("Enter the breadth"));
    area=l*b;
    int castedArea = (int) (area);
    JOptionPane.showMessageDialog(null,castedArea);
}
}

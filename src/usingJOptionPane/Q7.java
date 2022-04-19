package usingJOptionPane;

import javax.swing.*;

public class Q7 {
    public static void main(String[] args) {


        String name, rollNo, interest;
        name = JOptionPane.showInputDialog("Name ");
        rollNo= JOptionPane.showInputDialog("Roll Number ");
        interest= JOptionPane.showInputDialog("Field of Interest ");
        JOptionPane.showMessageDialog(null,"Hey, my name is "+name+" and my roll number is "+rollNo+". My field of interest are "+interest+".");
    }
}

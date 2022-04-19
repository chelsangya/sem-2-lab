package usingJOptionPane;
import javax.swing.*;

public class Q1 {
    public static void main(String[] args) {
        String name, rollNo, age, phoneNo;
        name = JOptionPane.showInputDialog("Enter the name ");
        rollNo = JOptionPane.showInputDialog("Enter the roll number ");
        age = JOptionPane.showInputDialog("Enter the age ");
        phoneNo = JOptionPane.showInputDialog("Enter the phone number ");
        JOptionPane.showMessageDialog(null, "Name:" + name + "\n Roll Number:" + rollNo + "\n Age:" + age + "\n Phone Number:" + phoneNo);
    }
}

package usingJOptionPane;
import javax.swing.*;

public class Q8 {
    public static void main(String[] args) {
        int l,l2,area,perimeter,vol1,principal,rate,time,SI,len1,ht,area2,len2,br,vol2,ht2;
        l=Integer.parseInt(JOptionPane.showInputDialog("Enter the Length of the Square"));
        area=l*l;
        perimeter=4*l;
        JOptionPane.showMessageDialog(null,"Area:"+area+"\n Perimeter"+perimeter);
        l2=Integer.parseInt(JOptionPane.showInputDialog("Enter the Length of the Cube"));
        vol1=l2*l2*l2;
        JOptionPane.showMessageDialog(null,"Volume:"+vol1);
        principal=Integer.parseInt(JOptionPane.showInputDialog("Enter the Principal"));
        rate=Integer.parseInt(JOptionPane.showInputDialog("Enter the Rate"));
        time=Integer.parseInt(JOptionPane.showInputDialog("Enter the Time"));
        SI=principal*time*rate;
        JOptionPane.showMessageDialog(null,"Simple Interest:"+SI);
        ht=Integer.parseInt(JOptionPane.showInputDialog("Enter the Height of the Triangle"));
        len1=Integer.parseInt(JOptionPane.showInputDialog("Enter the Breadth of the Triangle"));
        area2=(len1*ht)/2;
        JOptionPane.showMessageDialog(null,"Area:"+area2);
        len2=Integer.parseInt(JOptionPane.showInputDialog("Enter the Length of the Cuboid"));
        br=Integer.parseInt(JOptionPane.showInputDialog("Enter the Breadth of the Cuboid"));
        ht2=Integer.parseInt(JOptionPane.showInputDialog("Enter the Height of the Cuboid"));
        vol2=len2*br*ht2;
        JOptionPane.showMessageDialog(null,"Volume:"+vol2);




    }


}

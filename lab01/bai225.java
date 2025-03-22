import javax.swing.JOptionPane;
public class bai225{
    public static void main(String[] args) {
        double num1;
        double num2;
        num1= Double.parseDouble( JOptionPane.showInputDialog("please enter first num: "));
        num2= Double.parseDouble( JOptionPane.showInputDialog("please enter second num: "));
        JOptionPane.showMessageDialog(null, "tong " +(num1+num2)+" hieu "+(num1-num2)+ " tich "+ (num2*num1)+ " thuong "+(num1/num2));
        System.exit(0);
    }
}
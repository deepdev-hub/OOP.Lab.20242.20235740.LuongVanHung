import javax.swing.JOptionPane;
public class bai224{
    public static void main(String[] args) {
        String num1;
        String num2;
        String notification = "ban vua nhap: ";
        num1= JOptionPane.showInputDialog("please enter first num: ");
        num2= JOptionPane.showInputDialog("please enter second num: ");
        notification = notification+num1+num2;
        JOptionPane.showMessageDialog(null, notification);
        System.exit(0);
    }
}
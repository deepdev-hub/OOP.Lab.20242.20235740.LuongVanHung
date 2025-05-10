import javax.swing.JOptionPane;
public class bai223{
    public static void main(String[] args) {
        String name;
        name = JOptionPane.showInputDialog("please enter your name: ");
        JOptionPane.showMessageDialog(null, "hello "+ name);
        System.exit(0);
    }
}
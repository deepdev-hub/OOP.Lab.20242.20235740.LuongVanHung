
import javax.swing.JOptionPane;


public class bai62 {
   public static void main(String[] var0) {
        String name =  JOptionPane.showInputDialog("nhap ten: ");
        String tuoi =  JOptionPane.showInputDialog("nhap tuoi: ");
        String chieuCao =  JOptionPane.showInputDialog("nhap chieu cao: ");
        JOptionPane.showMessageDialog(null, "ban la :"+name +" "+ tuoi+" tuoi "+ " cao: "+chieuCao);
        System.exit(0);
   }
}

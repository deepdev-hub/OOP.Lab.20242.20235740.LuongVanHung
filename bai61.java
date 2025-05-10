import javax.swing.JOptionPane;

public class bai61{
    public static void main(String[] args) {
        int option =JOptionPane.showConfirmDialog(null, "ban co muon thay doi ve hang thuong gia?");
        JOptionPane.showMessageDialog(null, "ban da chon: "+ (option == JOptionPane.YES_OPTION?"yes": "no"));
        System.exit(0);
    }
}
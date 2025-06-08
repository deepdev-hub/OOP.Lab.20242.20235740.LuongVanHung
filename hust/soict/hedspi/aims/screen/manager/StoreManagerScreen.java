package hust.soict.hedspi.aims.screen.manager;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.store.Store;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class StoreManagerScreen extends JFrame{
    private Store store;
    
    public StoreManagerScreen(Store store){
        this.store = store;
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
    
        container.add(createNorth(), BorderLayout.NORTH);
        container.add(createCenter(), BorderLayout.CENTER);

        setTitle("Store manager");
        setSize(1024, 768);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }


    
    JPanel createNorth(){
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }
    JMenuBar createMenuBar(){
        JMenu menu = new JMenu("options");

        JMenu smUpdateStore = new JMenu("update store");
        JMenuItem addBook = new JMenuItem("add book");
        JMenuItem addDVD = new JMenuItem("add book");
        JMenuItem addCD = new JMenuItem("add book");

        smUpdateStore.add(addBook);
        smUpdateStore.add(addCD);
        smUpdateStore.add(addDVD);
        
        menu.add(smUpdateStore);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);
        return menuBar;
    }
    JPanel createHeader(){
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
        JLabel title = new JLabel("AIMS Store");

        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        header.add(javax.swing.Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        title.setForeground(Color.CYAN);
        return header;
    }
    JPanel createCenter(){
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(0,3,2,2));
        List<Media> medias = store.getListMedia();
        for(Media media : medias){
            MediaStore cell = new MediaStore(media);
            center.add(cell);
        }
        return center;
    }
   
}

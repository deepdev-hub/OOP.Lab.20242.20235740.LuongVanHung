package hust.soict.hedspi.aims.screen.manager;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Playable;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MediaStore  extends JPanel{
    private  Media media;
    public MediaStore(Media media){
        this.media = media;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 15));
        title.setAlignmentX(CENTER_ALIGNMENT);
        add(title);

        JLabel cost = new JLabel(media.getCost()+"$");
        cost.setFont(new Font(title.getFont().getName(), Font.PLAIN, 15));
        add(cost);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.add(container);

        JPanel btn = new JPanel();
        btn.setLayout(new FlowLayout(FlowLayout.CENTER));

        if(media instanceof Playable){
            JButton playbtn = new JButton("play");
            btn.add(playbtn);
        }

        setBorder(BorderFactory.createLineBorder(Color.BLACK));


        
    }
}

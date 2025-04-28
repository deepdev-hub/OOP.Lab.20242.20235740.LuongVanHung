package hust.soict.dsai.aims.sort;

import hust.soict.dsai.aims.media.Media;
import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>{
    @Override
    public int compare(Media media1, Media media2){
        int costCompare=  Float.compare(media2.getCost(), media1.getCost() );
        if(costCompare!=0){
            return costCompare;
        }
        return media1.getTitle().compareToIgnoreCase(media2.getTitle());
    }

}

package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.Media;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private  List<Media> listMedia = new ArrayList<>();
    
    public void addMedia(Media media){
        if(listMedia.contains(media)){
            System.out.println("media da co trong cua hang");
            return;
        }
        listMedia.add(media);
        System.out.println("Add media successfully");
    }
    public void removeMedia(Media media){
        listMedia.remove(media);
    }
    public void print(){
        for(Media elm :  listMedia){
            System.out.println(elm);
        }
    }
    public List<Media> getListMedia() {
        return listMedia;
    }
    public void setListMedia(List<Media> listMedia) {
        this.listMedia = listMedia;
    }

}

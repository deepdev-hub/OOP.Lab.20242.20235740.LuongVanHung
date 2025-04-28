package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CD extends Disc implements Playable{
    public List<Track> getListTrack() {
        return listTrack;
    }
    public void setListTrack(List<Track> listTrack) {
        this.listTrack = listTrack;
    }
    private List<Track> listTrack = new ArrayList<>();
    public CD(int id, String title, String category,  String director, int length, float  cost ) {
        super(category, cost, id, title, director, length);
    }
    @Override
    public void inTTin(){
        System.out.println("title: "+this.title);
        System.out.println("category: "+this.category);
        System.out.println("director: "+this.director);
        System.out.println("length: "+this.length);
        System.out.printf("cost: %.2f\n", this.cost);
    }

    @Override
    public String toString (){
        return "CD - " + getTitle() + " - " + getCategory() + " - " + getDirector() +
        " - " + getLength() + ": " + getCost() + "$";
    }
    public void addTrack(Track track){
        if(listTrack.contains(track)){
            System.out.println("This track was already in that CD");
        }
        listTrack.add(track);

    }
    
    public void removeTrack(Track track){
        listTrack.remove(track);
    }
    @Override
    public void play() {
        this.inTTin();
        for (Track elem : listTrack) {
            elem.play();
            
        }
    }
}

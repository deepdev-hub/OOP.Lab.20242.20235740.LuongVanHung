package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class DVD extends Disc implements Playable{
    public List<Track> getListTrack() {
        return listTrack;
    }
    
    public DVD(String category, float cost, int id, String title, String director, int length, List<Track> listTrack) {
        super(category, cost, id, title, director, length);
        this.listTrack = listTrack;
    }
    public DVD(String category, float cost, int id, String title, String director, int length) {
        super(category, cost, id, title, director, length);
    }

    public void setListTrack(List<Track> listTrack) {
        this.listTrack = listTrack;
    }
    private List<Track> listTrack = new ArrayList<>();
    public DVD(int id, String title, String category,String director, int length,  float cost) {
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
        return "DVD - " + getTitle() + " - " + getCategory() + " - " + getDirector() +
        " - " + getLength() + ": " + getCost() + "$";
    }
    public void addTrack(Track track){
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

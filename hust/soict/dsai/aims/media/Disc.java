package hust.soict.dsai.aims.media;

public class Disc extends Media{
    String director ;
    int length;


    public Disc(String category, float cost, int id, String title, String director, int length) {
        super(category, cost, id, title);
        this.director = director;
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}
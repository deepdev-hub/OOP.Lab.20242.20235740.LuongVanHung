package hust.soict.hedspi.aims.media;

public class Track implements Playable{
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void play() {
        System.out.println("Tieu de: "+this.getTitle()+ " length: "+this.getLength());
    }
    @Override
    public int hashCode() {
        return this.getTitle().toLowerCase().hashCode();
    }
    @Override
    public boolean equals(Object o){
        if(this==o){
            return true;
        }
        if (!(o instanceof  Track)) {
            return false;
        }
        Track track= (Track)o;
        return this.getTitle().equalsIgnoreCase(track.getTitle())&&this.getLength()==track.getLength();
    }

}

package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.sort.MediaComparatorByCostTitle;
import hust.soict.dsai.aims.sort.MediaComparatorByTitleCost;
import java.util.Comparator;

public abstract class Media {
    int id;
    String title;
    String category;
    float cost;
    public static final Comparator<Media> MEDIA_TITLE_COST_COMPARATOR = new MediaComparatorByTitleCost();
    public static final Comparator<Media> MEDIA_COST_TITLE_COMPARATOR = new MediaComparatorByCostTitle();

    public Media(String category, float cost, int id, String title) {
        this.category = category;
        this.cost = cost;
        this.id = id;
        this.title = title;
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
        if (!(o instanceof  Media)) {
            return false;
        }
        Media media = (Media)o;
        return this.getTitle().equalsIgnoreCase(media.getTitle());
    }

    public String tosString(){
        return "this is not a media, unknow type!!";
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    public void inTTin(){
        System.out.println("id: "+this.id);
        System.out.println("title: "+this.title);
        System.out.println("category: "+this.category);
        System.out.printf("cost: %.2f\n", this.cost);
    }

}

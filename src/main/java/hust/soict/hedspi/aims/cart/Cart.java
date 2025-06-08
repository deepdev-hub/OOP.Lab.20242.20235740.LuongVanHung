package hust.soict.hedspi.aims.cart;
import hust.soict.hedspi.aims.media.*;
import java.util.ArrayList;
import java.util.Collections;

public class Cart {
    public static final int MAX_AMOUNT = 20;

    private ArrayList<Media> listItemOrder = new ArrayList<>();

    private int quantityMediaintheCart = 0;

    public static int getMaxAmount() {
        return MAX_AMOUNT;
    }
    public void listMediaInTheCart(){
        for(Media Media: this.listItemOrder){
            Media.inTTin();
        }
    }

    public int getQuantityMediaintheCart() {
        return quantityMediaintheCart;
    }
    
    public boolean addMedia(Media media){
        if(listItemOrder.contains(media)){
            System.out.println("media already in the cart");
            return false;
        }
        if(quantityMediaintheCart<20){
            if (media != null) { // Kiểm tra null trước khi thêm
                listItemOrder.add(media);
            }
            System.out.println("Add successfully!");
            this.quantityMediaintheCart++;
            return true;
        }
        System.err.println("Cart da day!!, khong the add them Media");
        return false;

    }
    public void removeMedia(Media media){
        if(quantityMediaintheCart>0){
            listItemOrder.remove(media);
            quantityMediaintheCart--;
        }
    }

    public double totalCost() {
        double sum = 0;
        for (Media item : listItemOrder) {
            sum+= item.getCost();
        }
        return sum;
    }
    public void print(){
        for(Media elm :  listItemOrder){
            System.out.println(elm);
        }
    }
    public void SearchByID(int id){
        boolean notFound = true;
        for(Media Media : listItemOrder){
            if(Media.getId()==id){
                Media.inTTin();
                notFound=false;
            }
        }
        if(notFound==true){
            System.out.println("item not found!!");
        }
    }
    public void SearchByTitle(String title){
        boolean notFound = true;
        for(Media Media : listItemOrder){
            if(Media.getTitle().equals(title)){
                Media.inTTin();
                notFound=false;
            }
        }
        if(notFound==true){
            System.out.println("item not found!!");
        }
    }
    public ArrayList<Media> getListItemOrder() {
        return listItemOrder;
    }
    public void setListItemOrder(ArrayList<Media> listItemOrder) {
        this.listItemOrder = listItemOrder;
    }
    public void sortByTitleCost(){
        Collections.sort(listItemOrder, Media.MEDIA_TITLE_COST_COMPARATOR);
    }
    public void sortByCostTitle(){
        Collections.sort(listItemOrder, Media.MEDIA_COST_TITLE_COMPARATOR);
    }
}


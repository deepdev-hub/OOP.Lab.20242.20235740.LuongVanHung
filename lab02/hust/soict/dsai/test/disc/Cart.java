package hust.soict.dsai.test.disc;
import java.util.ArrayList;

public class Cart {
    public static final int MAX_AMOUNT = 20;

    private ArrayList<DVD> itemsOrdered;

    public Cart() {
        itemsOrdered = new ArrayList<>(); 
    }
    private int quantityDVDintheCart = 0;

    public static int getMaxAmount() {
        return MAX_AMOUNT;
    }
    public void listDVDInTheCart(){
        for(DVD dvd: this.itemsOrdered){
            dvd.displayDVD();
        }
    }

    public int getQuantityDVDintheCart() {
        return quantityDVDintheCart;
    }

    public boolean addDVD(DVD dvd){
        if(quantityDVDintheCart<20){
            if (dvd != null) { // Kiểm tra null trước khi thêm
                itemsOrdered.add(dvd);
            }
            this.quantityDVDintheCart++;
            return true;
        }
        System.err.println("khong the add them dvd");
        return false;

    }

    public double totalCost() {
        double sum = 0;
        for (DVD item : itemsOrdered) {
            sum+= item.getCost();
        }
        return sum;
    }
 

}


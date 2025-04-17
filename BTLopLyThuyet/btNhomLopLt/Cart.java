import java.util.ArrayList;

public class Cart {
    public static final int MAX_AMOUNT = 20;

    private ArrayList<Book> itemsOrdered;

    public Cart() {
        itemsOrdered = new ArrayList<>(); 
    }
    private int quantityDVDintheCart = 0;

    public static int getMaxAmount() {
        return MAX_AMOUNT;
    }
    public void listDVDInTheCart(){
        for(Book dvd: this.itemsOrdered){
            dvd.displayDVD();
        }
    }

    public int getQuantityDVDintheCart() {
        return quantityDVDintheCart;
    }

    public boolean addDVD(Book dvd){
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
        for (Book item : itemsOrdered) {
            sum+= item.getCost();
        }
        return sum;
    }
 

}


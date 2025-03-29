public class Aims {
    
    
    public static void main(String[] args) {
        Cart cart1 = new Cart();
        DVD dvd1 = new DVD ("The Lion King", "Animation", "Roger Allers", 87, 19.95f); 
        DVD dvd2 = new DVD ("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f); 
        cart1.addDVD(dvd2); 
        DVD dvd3 = new DVD("Aladin", "Animation", 18.99f); 
        cart1.addDVD(dvd3);   
        cart1.addDVD(dvd1); 
        cart1.listDVDInTheCart();
        System.out.println("tong gia: "+ cart1.totalCost());
    }
    
    
}
package hust.soict.hedspi.test;

import hust.soict.hedspi.aims.media.DVD;
import hust.soict.hedspi.aims.media.Disc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.screen.manager.StoreManagerScreen;
import hust.soict.hedspi.aims.store.Store;

public class test {
     public static void main(String[] args) {
        Store store = new Store();
        Media d1 = new Disc("Action", 15.99f, 1, "Avengers", "Joss Whedon", 143);
        Media d2 = new Disc("Drama", 12.50f, 2, "The Godfather", "Francis Ford Coppola", 175);
        Media d3 = new Disc("Sci-fi", 18.00f, 3, "Inception", "Christopher Nolan", 148);
        Media d4 = new Disc("Action", 15.99f, 4, "Avengers end game", "Joss Whedon", 143); // duplicate ID
        DVD d5 = new DVD("Action", 15.99f, 4, "nwe dvd", "Joss Whedon", 143); // duplicate ID

        // Thêm vào store
        store.addMedia(d1);
        store.addMedia(d2);
        store.addMedia(d3);
        store.addMedia(d4); 
        store.addMedia(d5); 
        new StoreManagerScreen(store);
    }
}

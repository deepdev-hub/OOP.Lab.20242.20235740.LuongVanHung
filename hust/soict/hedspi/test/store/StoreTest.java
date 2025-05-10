package hust.soict.hedspi.test.store;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CD;
import hust.soict.hedspi.aims.media.DVD;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.store.Store;
import java.util.ArrayList;
import java.util.List;

public class StoreTest {
    public static void main(String[] args) {
        Media Media1 = new DVD(1, "ironman", "film marvel","tony",  1, (float) 1.0);
        Media Media2 = new DVD(2, "mat biec", "phim tenh cam","tony",  1, 1.0f);
        List<String> listAuthor = new ArrayList<>();
        listAuthor.add("hung");
        listAuthor.add("hoang");
        listAuthor.add("trinh");
        Media Media3 = new Book(1000, "book1", "sachvui.com", 1000, listAuthor);
        Media Media4 = new CD(1, "audio1", "phim vietnam","tony", 1000,100);

        Store store = new Store();
        
        store.addMedia(Media2);
        store.addMedia(Media1);
        store.addMedia(Media4);
        store.addMedia(Media3);
        store.print();
        
    }
}

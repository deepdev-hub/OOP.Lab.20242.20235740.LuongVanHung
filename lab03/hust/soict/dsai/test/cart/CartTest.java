package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CD;
import hust.soict.dsai.aims.media.DVD;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.test.disc.Cart;
import java.util.ArrayList;
import java.util.List;

public class CartTest {
    public static void main(String[] args) {
        Media dvd2 = new DVD(2, "dvd2", "phim vietnam", "ken tran",1,  100000);
        Media dvd1 = new DVD(1,"dvd1", "phim marvel", "tony",  1, 80000);
        Media Media1 = new DVD(1, "ironman", "film marvel","tony",  1, (float) 1.0);
        Media Media2 = new DVD(2, "mat biec", "phim tenh cam","tony",  1, 1.0f);
        List<String> listAuthor = new ArrayList<>();
        listAuthor.add("hung");
        listAuthor.add("hoang");
        listAuthor.add("trinh");
        Media Media3 = new Book(1000, "book1", "sachvui.com", 1000, listAuthor);
        Media Media4 = new CD(1, "audio1", "phim vietnam","tony", 1000,100);
        Cart cart1 = new Cart();
        cart1.addMedia(dvd1);
        cart1.addMedia(dvd2);
        cart1.addMedia(Media4);
        cart1.addMedia(Media1);
        cart1.addMedia(Media2);
        cart1.addMedia(Media3);
        cart1.sortByTitleCost();
        cart1.print();
        System.err.println("search by title: dvd1");
        cart1.SearchByTitle("dvd1");
    }

}

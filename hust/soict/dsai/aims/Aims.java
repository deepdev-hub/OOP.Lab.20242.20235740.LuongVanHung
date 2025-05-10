package hust.soict.hedspi.aims;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CD;
import hust.soict.hedspi.aims.media.DVD;
import hust.soict.hedspi.aims.media.Media;

public class Aims {
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    public static void storeMenu() {
        {System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");}

    }
    public static void mediaDetailsMenu() {
        {System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");}
    }
    public static void cartMenu() {
        {System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter media in cart");
        System.out.println("2. Sort media in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");}
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            {
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
                cart1.addMedia(dvd2);
                Media dvd3 = new DVD(1, "Aladin", "Animation","",  1, 18.99f);
                cart1.addMedia(dvd3);
                cart1.addMedia(dvd1);
            }
            int menu2=1;
            int menu1=1;
            while (menu1!=0){
                showMenu();
                try {
                    menu1 = scanner.nextInt();
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number!");
                    continue;
                }
                switch (menu1) {
                    case 0 -> {
                        System.out.println("exit. bye");
                    }
                    case 1 -> {
                        do {
                            storeMenu();
                            try {
                                menu2 = scanner.nextInt();
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid input. Please enter a number!");
                                continue;
                            }
                            switch (menu2) {
                                case 0 -> {}
                                case 1 -> {}
                                case 2 -> {}
                                case 3 -> {}
                                default -> System.out.println("vui long nhap dung dinh dang 0-1-2-3");
                            }
                        } while (menu2!=0);
                    }
                    case 2 -> 
                    {
                        do {
                            mediaDetailsMenu();
                            try {
                                menu2 = scanner.nextInt();
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid input. Please enter a number!");
                                continue;
                            }
                            switch (menu2) {
                                case 0 -> {}
                                case 1 -> {}
                                case 2 -> {}
                                case 3 -> {}
                                default -> System.out.println("vui long nhap dung dinh dang 0-1-2-3");
                            }
                        } while (menu2!=0);
                    }
                    case 3 ->
                    {
                        do {
                            cartMenu();
                            try {
                                menu2 = scanner.nextInt();
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid input. Please enter a number!");
                                continue;
                            }
                            switch (menu2) {
                                case 0 -> {}
                                case 1 -> {}
                                case 2 -> {}
                                case 3 -> {}
                                default -> System.out.println("vui long nhap dung dinh dang 0-1-2-3");
                            }
                        } while (menu2!=0);
                    }
                    default -> System.out.println("vui long nhap dung dinh dang 0-1-2-3");
                }
            }
        }
    }
    
    
    
}
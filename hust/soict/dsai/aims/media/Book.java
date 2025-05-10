package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private List<String> listAuthor = new ArrayList<>();
    public List<String> getListBook() {
        return listAuthor;
    }
    
    public Book(int id, String title, String category, float cost, List<String> listAuthor) {
        super(category, cost, id, title);
        this.listAuthor = listAuthor;
    }
    public void setListBook(List<String> listBook) {
        this.listAuthor = listBook;
    }
    public void addAuthor(String author){
        listAuthor.add(author);
    }
    public void removeAuthor(String author){
        listAuthor.remove(author);
    }
    @Override
    public String toString (){
        return "Book- " + getTitle() + " - " + getCategory()  + 
        ": " + getCost() + "$";
    }
    
}

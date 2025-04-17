public class Book extends Products {
    private String category = "null";
    private String author = "null";
    private String isbn ;
    
    public void displayBook(){
        System.out.println("title: "+this.name);
        System.out.println("category: "+this.category);
        System.out.println("price: "+this.sellPrice);
        System.out.println("quantity: "+this.quantity);
        System.out.println("author: "+this.author);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}




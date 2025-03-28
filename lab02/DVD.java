public class DVD {
    private String tilte = "null";
    private String category = "null";
    private String director = "null";
    private int length = 0;
    private double cost = 0;

    
    public DVD( ) {
        this.category = "";
        this.cost = 0;
        this.director = "";
        this.length = 0;
        this.tilte = "";
    }
    public DVD(String tilte, String category,  String director, int length, double cost ) {
        this.category = category;
        this.cost = cost;
        this.director = director;
        this.length = length;
        this.tilte = tilte;
    }
    public DVD(String tilte) {
        this.tilte = tilte;
        this.category = "";
        this.cost = 0;
        this.director = "";
        this.length = 0;
    }
    public DVD(String tilte, String category, double cost) {
        this.category = category;
        this.cost = cost;
        this.tilte = tilte;
        this.director = "";
        this.length = 0;
    }
    public DVD( String tilte, String category,  String director, double cost) {
        this.category = category;
        this.cost = cost;
        this.director = director;
        this.tilte = tilte;
        this.length = 0;
    }

    public String getTilte() {
        return tilte;
    }

    public void setTilte(String tilte) {
        this.tilte = tilte;
    }

    public String getCategory() {
        return category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    
    public void setCost(double cost) {
        this.cost = cost;
    }
    public double getCost() {
        return this.cost;
    }
    public void displayDVD(){
        System.out.println("title: "+this.tilte);
        System.out.println("category: "+this.category);
        System.out.println("director: "+this.director);
        System.out.println("length: "+this.length);
        System.out.printf("cost: %.2f\n", this.cost);
    }
}

public class Stationary extends Products {
    private int stationary_id;
    private String brand= "null";
    private String type = "null";
    private String color = "null";


    
  
    public void displayDVD(){
        System.out.println("name: "+this.name);
        System.out.println("category: "+this.type);
        System.out.println("brand: "+this.brand);
        System.out.println("color: "+this.color);
        System.out.printf("cost: %d\n", this.sellPrice);
    }




    public int getStationary_id() {
        return stationary_id;
    }




    public void setStationary_id(int stationary_id) {
        this.stationary_id = stationary_id;
    }




    public String getBrand() {
        return brand;
    }




    public void setBrand(String brand) {
        this.brand = brand;
    }




    public String getType() {
        return type;
    }




    public void setType(String type) {
        this.type = type;
    }




    public String getColor() {
        return color;
    }




    public void setColor(String color) {
        this.color = color;
    }




    
}

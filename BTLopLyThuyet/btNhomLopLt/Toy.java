public class Toy extends  Products{
    private String category = "null";
    private double cost = 0;
    private int suitableAge;

    public void displayDVD(){
        System.out.println("title: "+this.name);
        System.out.println("category: "+this.category);
        System.out.println("suitable age: "+this.suitableAge);
        System.out.printf("cost: %.2f\n", this.cost);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getSuitableAge() {
        return suitableAge;
    }

    public void setSuitableAge(int suitableAge) {
        this.suitableAge = suitableAge;
    }




    
}



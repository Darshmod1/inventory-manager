
public class Item {
    // variables
    private String name;
    private int quantity;
    private double price;
    private String category;

    // constructor

    public Item(String name, int quantity, double price, String category){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return name + " | qty: " + quantity + " | $" + price + " | " + category;
    }

}

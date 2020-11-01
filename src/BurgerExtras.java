public class BurgerExtras {
    private int id;
    private String name;
    private double price;

    public BurgerExtras(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getId() {
        return this.id;
    }
}

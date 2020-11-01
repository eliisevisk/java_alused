import java.util.*;

public class Burger {
    private String name;
    private String meat;
    private String bread;
    private double price;

    public Burger(String name, String meat, String bread, double price){
        this.name = name;
        this.meat = meat;
        this.bread = bread;
        this.price = price;
    }

    public Burger(String name, String meat, double price){
        this.name = name;
        this.meat = meat;
        this.bread = "teraleib";
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

}

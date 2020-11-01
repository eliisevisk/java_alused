import java.util.ArrayList;

public class Order {
    private ArrayList<Burger> menu;
    private ArrayList<BurgerExtras> extras;
    private String orderName;
    private double orderPrice;
    private ArrayList<String> orderExtras;

    public Order(){
        menu = new ArrayList<Burger>();
        extras = new ArrayList<BurgerExtras>();
        orderExtras = new ArrayList<String>();
        menu.add(new Burger("Chicken Burger", "Chicken filet", "Wheat", 7.50));
        menu.add(new Burger("Old Fashioned Cheeseburger", "Beef patty", "Wheat", 5.50));
        menu.add(new Burger("New York Burger", "Pulled pork", 8.50));

        extras.add(new BurgerExtras(1, "Mayo", 0.50));
        extras.add(new BurgerExtras(2, "Salad", 0.50));
        extras.add(new BurgerExtras(3, "Sweet peppers", 0.50));
        extras.add(new BurgerExtras(4, "Onions", 0.50));
        extras.add(new BurgerExtras(5, "Tomatoes", 0.50));
        extras.add(new BurgerExtras(6, "Pickles", 0.50));
        extras.add(new BurgerExtras(7, "Bacon", 1.50));
        extras.add(new BurgerExtras(8, "Double meat", 3.00));
    }

    public void addBurger(String name, String meat, String bread, double price){
        menu.add(new Burger(name, meat, bread, price));
    }

    public void addExtra(int id, String name, double price){
        extras.add(new BurgerExtras(id, name, price));
    }

    public void getMenu(){
        for(Burger item : this.menu){
            System.out.println(item.getName() + " | " + item.getPrice() + "€");
        }
    }

    public void getExtras(){
        for(BurgerExtras item : this.extras){
            System.out.println(item.getId()+ ". " + item.getName() + " | +" + item.getPrice() + "€");
        }
    }

    public void orderBurger(String term) {
        for(Burger burger : menu) {
            String itemName = burger.getName();
            if(itemName.contains(term)){
                this.orderPrice = burger.getPrice();
                this.orderName = itemName;
            }
        }
    }

    public void addExtra(int id){
        for(BurgerExtras item : extras) {
            if(id == item.getId()){
                this.orderExtras.add(item.getName());
                this.orderPrice = orderPrice + item.getPrice();
            }
        }
    }

    public String confirmOrder() {
        if(this.orderExtras == null){
            return "You have ordered a " + this.orderName + " which costs " + this.orderPrice;
        } else {
            return "You have ordered a "+ this.orderName + " with the following extras: " + orderExtras + ". This comes in total of " + this.orderPrice + "€";
        }
    }

}

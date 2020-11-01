import java.util.*;

public class Main {
    /*public static void main(String[] args) {
        ArrayList<Integer> base = new ArrayList<Integer>();
        int i = 10;
        int y = 0;
        int iterator = 0;
        while(i>0){
            i--;
            base.add(i);
        }

        for(int num : base){
            System.out.print(num);
        }
        System.out.println("");

        while(y <= 9){
            while(iterator < y){
                base.set(iterator, base.get(iterator)-1);
                iterator++;
            }
            iterator = 0;
            System.out.print(base);
            System.out.println("");
            y++;
        }
    }*/
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Order mari = new Order();

        System.out.println("Menu: ");
        mari.getMenu();
        System.out.println("");
        System.out.println("Extras: ");
        mari.getExtras();

        System.out.println("Enter your burger name: ");
        String mariBurger = reader.nextLine();
        mari.orderBurger(mariBurger);
        System.out.println("Enter your extras (by id). Enter 0 for none: ");
        int extra = Integer.parseInt(reader.nextLine());
        while(extra != 0){
            mari.addExtra(extra);
            System.out.println("Enter extra. Enter 0 for finalisation: ");
            extra = Integer.parseInt(reader.nextLine());
        }

        System.out.println("");
        System.out.println("Dear Mari, " + mari.confirmOrder());
    }
}

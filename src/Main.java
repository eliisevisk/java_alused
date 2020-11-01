import java.util.*;

public class Main {
    public static void main(String[] args) {
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
    }
}

package JavaProBitLab.DB;

import JavaProBitLab.Model.Items;

import java.util.ArrayList;

public class DBManager {
     private static Long id = 5L;
     public static ArrayList<Items> arr = new ArrayList<>();

        static {
            arr.add(new Items(1L, "tovar1", "asdwqdj;kvjxlc", 45000));
            arr.add(new Items(2L, "tovar2", "asdwqdj;kvjxlc", 22000));
            arr.add(new Items(3L, "tovar3", "asdwqdj;kvjxlc", 6000));
            arr.add(new Items(4L, "tovar4", "asdwqdj;kvjxlc", 80000));
        }

    public static ArrayList<Items> getAllItems(){
            return arr;
    }

    public static Items getDetails(Long idDetails){
            Items item = new Items();
            for (Items i : arr) {
                Long id = i.getId();
                String name = i.getName();
                String deskript = i.getDescription();
                double price = i.getPrice();
                if (id == idDetails)
                    item = new Items(id, name, deskript, price);
            }
        return item;
    }

    public static boolean addItem(String name, String description, double price){
            boolean b;
            if (name != null & description != null & price > 0) {
                arr.add(new Items(id, name, description, price));
                id++;
                b = true;
            } else {
                b = false;
            }
            return b;
    }
}

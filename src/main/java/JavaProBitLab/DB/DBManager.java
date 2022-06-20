package JavaProBitLab.DB;

import JavaProBitLab.Model.Items;

import java.util.ArrayList;

public class DBManager {
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
}

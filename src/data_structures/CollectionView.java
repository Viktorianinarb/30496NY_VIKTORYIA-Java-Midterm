package data_structures;

import java.util.Collection;
import java.util.HashMap;


public class CollectionView {

    /**
     * INSTRUCTIONS
     * <p>
     * A map is given to you below, with some data inserted into it.
     * <p>
     * Retrieve the Collection view of the values present in map
     */

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(5, "San Jose");
        map.put(6, "Seattle");
        map.put(2, "LA");
        map.put(4, "Boston");
        map.put(1, "NYC");
        map.put(3, "Denver");

//        for (Integer i : map.keySet())
//            System.out.println(map.get(i));

        // Collection view of the values present in map
        Collection<String> values = map.values();
        System.out.println("Collection view is: " + values);

    }
}

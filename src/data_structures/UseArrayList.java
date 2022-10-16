package data_structures;

import databases.SharedStepsDatabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

    /**
     * INSTRUCTIONS
     * <p>
     * Demonstrate how to use an ArrayList that includes using the add, peek, remove & retrieve methods.
     * Use For-Each loop and While-loop with Iterator to retrieve the data.
     * <p>
     * Store and retrieve the data from/to a database table.
     */

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(3);
        arr.add("John");
        arr.add("Bethy");
        arr.add("Tiffany");
        arr.add("Katherine");
        arr.add("Taj");
        //we added the above values to arr
        System.out.println(arr);
        //or using for each loop it will look like that:
        for (String i : arr) {
            System.out.println(i);
        }

        // we use retrieve(get) below with while-loop
        int j = 0;
        while (j < arr.size()) {
            System.out.println(arr.get(j));
            j++;
        }
        // we use while-loop with iterator below

        Iterator<String> iter = arr.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        // we will use remove below to remove String value under index 0

        arr.remove(0);
        System.out.println("Arraylist arr after removed value under index 0: ");
        for (String i : arr) {
            System.out.println(i);
        }

        //Storing in database

        List arrlist = Arrays.asList(arr);
        SharedStepsDatabase sql = new SharedStepsDatabase();
        sql.insertList("tableList", "columnList", arrlist);

        //retrieving from database

        List<String> listfromDB = null;
        String query = "select * from tableList";
        try {
            listfromDB = sql.executeQueryReadAllSingleColumn(query, "columnList");
        } catch (Exception e) {
            e.getMessage();
        }
    }
}

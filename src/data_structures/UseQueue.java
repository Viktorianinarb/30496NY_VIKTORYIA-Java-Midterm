package data_structures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    /**
     * INSTRUCTIONS
     * <p>
     * Demonstrate how to use Queue that includes add, peek, remove & poll methods.
     * Use For-Each loop and While-Loop with Iterator to retrieve data.
     * <p>
     * Store and retrieve data from/to a database table.
     */


    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.add("ML");
        queue.add("Viktoryia");
        queue.add("Sami");
        queue.add("Monty");
        queue.add("Khalil");
//Values in queue
        System.out.println(queue);
        queue.remove();

        //Values after remove method
        System.out.println(queue);

        //Value after peek - or the head element of queue
        System.out.println(queue.peek());

        //Values after poll
        queue.poll();
        System.out.println(queue);

        //Iterator usage
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }

}

package data_structures;

import databases.SharedStepsDatabase;

import java.io.*;
import java.util.*;

public class DataReader {

    /**
     * INSTRUCTIONS
     * <p>
     * Create an API to read the .txt file and print it to the console.
     * HINT: Use BufferedReader class
     * Use try-catch block to handle any exceptions
     * <p>
     * Store and retrieve the file to/from a database table.
     * <p>
     * After reading from file using BufferedReader API, store each word, first into a LinkedList. Each word
     * should construct a node in LinkedList. Second, do the same, but with a Stack.
     * Finally, traverse through the list\stack & retrieve each item in `FIFO` order and `FILO` order, respectively
     * <p>
     * Demonstrate how to use a stack using push, peek, search & pop methods.
     * Use For-Each & While-loop with Iterator to retrieve/print data.
     **/

    public static void main(String[] args) {
        String textFilePath = System.getProperty("user.dir") + "/src/data_structures/data/self-driving-car";
        File file = new File(textFilePath);
        String fileContent = "";
        Stack<String> stack = new Stack();
        LinkedList<String> linkedList = new LinkedList<>();


        try {
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            String line;
            while ((line = br.readLine()) != null) {
                fileContent = fileContent + line;
                System.out.println(line);
                for (String word : line.split(" ")) {
                    stack.push(word); //stack push method
                    linkedList.add(word); //linkedlist add method
                }
            }


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Could not read from file");
        }

        //showing stack method peek (LIFO)

        System.out.println("Stack peek method takes the top: " + stack.peek());

        // Going over stack content
        System.out.println("Stack content is below: ");
        for (String word : stack) {
            System.out.println(word + " ");
        }

        // Going over linked list with iterator

        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

        //adding information to database - SOMETHING IS WRONG WITH CONNECTION!!!!!

        SharedStepsDatabase sql = new SharedStepsDatabase();
        sql.insertString("file_content", "file_column", fileContent);

        //retrieving information from database

        String query = "SELECT file_column From file_content ";
        String fileContentDB = null;
        try {
            fileContentDB = sql.executeQueryReadOne(query);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}

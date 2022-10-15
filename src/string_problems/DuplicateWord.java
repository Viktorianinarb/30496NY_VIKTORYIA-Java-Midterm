package string_problems;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWord {

    /**
     * INSTRUCTIONS
     * Write a java program to find duplicate words and the number of occurrences of those words in the given string.
     * Also, find the average length of all the words
     */

    public static void main(String[] args) {
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        st = st.toLowerCase();
        st = st.replaceAll("\\p{Punct}", "");
        HashMap<String, Integer> count = new HashMap<>();
        for (String word : st.split(" ")) {
            int i = count.getOrDefault(word, 0);
            count.put(word, i + 1);
        }
        System.out.println(count);

        st = st.trim();
        Pattern pattern = Pattern.compile(" ");
        Matcher matcher = pattern.matcher(st);
        int spacecount = 0;
        while (matcher.find()) {
            spacecount += 1;}
        int wordcount = spacecount + 1;
        st = st.replaceAll(" ", "");
        int charcount = st.length();
        int averagewordlength = charcount / wordcount;
        System.out.println(averagewordlength);
    }
}

package string_problems;

public class Anagram {

    /**
     * INSTRUCTIONS
     * Write a Java Program, `isAnagram`, to check if any two strings are anagrams
     * <p>
     * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
     * original letters exactly once.
     * <p>
     * Ex: "CAT" & "ACT",
     * "ARMY" & "MARY",
     * "FART" & "RAFT"
     */

    // Implement Here
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "dcbaa";
        String ret = "";
        for (int k = 0; k < str1.length(); k += 1) {
            ret = str1.charAt(k) + ret;
        }
        if (ret.equals(str2)) {
            System.out.println("Two strings are anagrams");
        } else {
            System.out.println("Two strings are not anagrams");
        }
    }
}
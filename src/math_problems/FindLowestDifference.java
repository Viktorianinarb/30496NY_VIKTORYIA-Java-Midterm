package math_problems;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FindLowestDifference {

    /**
     * INSTRUCTIONS
     * Write a method to return the lowest number, that is not shared between the 2 arrays below
     * HINT: The lowest number that isn't shared between these arrays is 1
     *
     * @return
     */

    public static void main(String[] args) {


        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1, -15};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, -15};

        //remove items that are shared and find minimum

        Set<Integer> nonShared = new HashSet<Integer>();
        for (int a : array1) {
            nonShared.add(a);
        }
        for (int a : array2) {
            nonShared.remove(a);
        }
        int result = Collections.min(nonShared);
        System.out.println(result);
    }
}

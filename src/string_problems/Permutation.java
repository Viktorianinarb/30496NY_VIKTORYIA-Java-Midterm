package string_problems;

public class Permutation {

    /**
     * INSTRUCTIONS
     * Create a Java program to compute all permutations of any given string
     * <p>
     * e.g. -  "ABC" = "ABC" "ACB" "BAC" "BCA" "CAB" "CBA"
     */

    // Print the array
    void printArr(char a[], int length) {
        length = a.length;
        for (int i = 0; i < length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    // Generating permutation using Heap Algorithm
    void heapPermutation(char a[], int size, int n) {
        // if size becomes 1 then prints the obtained
        // permutation
        if (size == 1)
            printArr(a, n);

        for (int i = 0; i < size; i++) {
            heapPermutation(a, size - 1, n);

            // if size is odd, swap 0th i.e (first) and
            // (size-1)th i.e (last) element
            if (size % 2 == 1) {
                char temp = a[0];
                a[0] = a[size - 1];
                a[size - 1] = temp;
            }

            // If size is even, swap ith
            // and (size-1)th i.e last element
            else {
                char temp = a[i];
                a[i] = a[size - 1];
                a[size - 1] = temp;
            }
        }
    }

    public static void main(String args[]) {
        Permutation obj = new Permutation();
        String data = "ABC";
        char[] a = new char[data.length()];
        for (int i = 0; i < data.length(); i++) {
            a[i] = data.charAt(i);
        }
        obj.heapPermutation(a, a.length, a.length);
    }
}


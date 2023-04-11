package permutation;

import java.util.ArrayList;
import java.util.List;

public class SimplePermutationInt {

    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4 };
        System.out.println(printAllRecursive(4, intArray));

    }

    static List<Integer> LIST = new ArrayList<>();

    public static List<Integer> printAllRecursive(int n, int[] elements) {

        //System.out.println(lista.size());
        if (n == 1) {
            //printArray(elements);
            if(!LIST.contains(arrayToInt(elements)) && elements[0] != 0) {
                LIST.add(arrayToInt(elements));
            }
            return LIST;


        } else {
            for (int i = 0; i < n - 1; i++) {
                printAllRecursive(n - 1, elements);
                if (n % 2 == 0) {
                    swap(elements, i, n - 1);
                } else {
                    swap(elements, 0, n - 1);
                }
            }
            printAllRecursive(n - 1, elements);
        }

        return LIST;

    }

    private static void swap(int[] input, int a, int b) {
        int tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }

    public static int arrayToInt(int[] arr) {
        StringBuilder s = new StringBuilder();
        for (int i : arr) {
            s.append(i);
        }
        return Integer.parseInt(s.toString());
    }
}

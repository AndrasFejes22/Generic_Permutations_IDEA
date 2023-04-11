package permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SimplePermutationString {

    public static void main(String[] args) {

        System.out.println("eke: "+solver("eke"));
        System.out.println("--------------------------------------------");
        System.out.println("BBAA: "+solver("BBAA"));
        //System.out.println("swap:");
        //swap2(stringToArray("AB"), 0, 1);

    }

    public static String[] stringToArray(String str){

        return str.split("");
    }

    private static void swap(String[] input, int a, int b) {
        String tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }

    private static void swap2(String[] input, int a, int b) {
        String tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
        System.out.println(input[a]);
        System.out.println(input[b]);
    }

    public static List<String> printAllRecursive(int n, String []elements, List<String> LIST) {

        if (n == 1) {
            if(!LIST.contains(Arrays.toString(elements)) && (elements)[0] != null) {
                LIST.add(Arrays.toString(elements));
            }
            return LIST;


        } else {
            for (int i = 0; i < n - 1; i++) {
                printAllRecursive(n - 1, elements, LIST);
                if (n % 2 == 0) {
                    swap(elements, i, n - 1);
                } else {
                    swap(elements, 0, n - 1);
                }
            }
            printAllRecursive(n - 1, elements, LIST);
        }
        Collections.sort(LIST);
        return LIST;

    }

    public static List<String> solver (String input){
        String[] inputToArray = stringToArray(input);
        int n = inputToArray.length;
        List<String> LIST = new ArrayList<>();
        return printAllRecursive(n, inputToArray, LIST);
    }
}

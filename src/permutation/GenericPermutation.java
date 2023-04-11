package permutation;

import java.util.*;


public class GenericPermutation<T extends Comparable<? super T>>{

    private T [] item;
    private T data;


    public void swap(T[] item, int a, int b) {
        T tmp = item[a];
        item [a] = item[b];
        item[b] = tmp;
    }

    public T[] itemToArray(T data){
        if(data.getClass().equals(String.class)){
            return (T[]) ((String)data).split("");
        } else {
            return (T[]) intToArray((Integer) data);
        }


    }

    public String[] stringToArray(String str){

        return str.split("");
    }

    public int arrayToInt(int[] arr) {
        StringBuilder s = new StringBuilder();

        for (int i : arr) {
            s.append(i);
        }

        return Integer.parseInt(s.toString());
    }

    public Integer[] intToArray(int num){
        String numberToString = String.valueOf(num);
        String[] strArray = numberToString.split("");
        Integer[] numbers = new Integer[strArray.length];
        for(int i = 0; i < strArray.length; i++){
            numbers[i] = Integer.parseInt(strArray[i]);
        }
        return numbers;
    }

    public List<T> printAllRecursive(T input){
        T[] inputToArray = itemToArray(input);
        int n = inputToArray.length;
        List<T> LIST = new ArrayList<>();
        return AllRecursive(n, inputToArray, LIST);
    }

    public  List<T> AllRecursive(int n, T []elements, List<T> LIST) {

        if (n == 1) {
            if(!LIST.contains(Arrays.toString(elements)) && (elements)[0] != null) {
                LIST.add((T) Arrays.toString(elements));
            }
            return LIST;


        } else {
            for (int i = 0; i < n - 1; i++) {
                AllRecursive(n - 1, elements, LIST);
                if (n % 2 == 0) {
                    swap(elements, i, n - 1);
                } else {
                    swap(elements, 0, n - 1);
                }
            }
            AllRecursive(n - 1, elements, LIST);
        }

        LIST.sort(Comparator.naturalOrder());
        return LIST;

    }

}

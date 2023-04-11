package main;

import permutation.GenericPermutation;

public class Main {

    public static void main(String[] args) {

        System.out.println("Integer permutation:");
        GenericPermutation<Integer> genericPermutation = new GenericPermutation<>();
        System.out.println(genericPermutation.printAllRecursive(123));
        System.out.println("----------------------------");

        System.out.println("String permutation:");
        GenericPermutation<String> genericPermutation2 = new GenericPermutation<>();
        System.out.println(genericPermutation2.printAllRecursive("123"));
        System.out.println("----------------------------");

        System.out.println("String permutation:");
        GenericPermutation<String> genericPermutation3 = new GenericPermutation<>();
        System.out.println(genericPermutation3.printAllRecursive("BBAA"));
        System.out.println("----------------------------");

    }


}

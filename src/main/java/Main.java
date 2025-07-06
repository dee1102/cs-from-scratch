package main.java;

import main.java.sorting.InsertionSortImplementation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Insertion Sort
        System.out.print("Insertion Sort:");
        int[] input = new int[]{4,3,6,2,7,1};
        System.out.print(Arrays.toString(input) + " -> ");
        InsertionSortImplementation.insertionSort(input);
        System.out.print(Arrays.toString(input));
    }
}
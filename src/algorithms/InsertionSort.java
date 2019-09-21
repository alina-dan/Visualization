package algorithms;

import core.AbstractSortingAlgorithm;
import visualization.Simple;

public class InsertionSort {

    public static void sort(int[] arr) {
        for (int iteration = 1; iteration < arr.length; iteration++) {
            for (int index = iteration; index > 0 && arr[index] < arr[index - 1]; index--) {
                swap(arr, index, index - 1);
            }
        }
        System.out.print("Final sequence is: ");
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + " ");
        }
        Simple x = new Simple();
    }

    public static void swap(int[] arr, int index, int toSwap) {
        int temp = arr[index];
        arr[index] = arr[toSwap];
        arr[toSwap] = temp;
    }

    public static void main(String args[]) {
        // Random testing
        int[] test1 = {5, 4, 3, 2, 1};
        System.out.println(AbstractSortingAlgorithm.isSorted(test1));
        sort(test1);
        System.out.print("Final sequence is: ");
        for (int x = 0; x < test1.length; x++) {
            System.out.print(test1[x] + " ");
        }
        System.out.println("");
        System.out.println(AbstractSortingAlgorithm.isSorted(test1));
        System.out.println("");

        // Test with repeat numbers.
        int[] test2 = {5, 4, 4, 2, 0};
        System.out.println(AbstractSortingAlgorithm.isSorted(test2));
        sort(test2);
        System.out.print("Final sequence is: ");
        for (int x = 0; x < test2.length; x++) {
            System.out.print(test2[x] + " ");
        }
        System.out.println("");
        System.out.println(AbstractSortingAlgorithm.isSorted(test2));
        System.out.println("");

        // Test with empty array.
        int[] test3 = {};
        System.out.println(AbstractSortingAlgorithm.isSorted(test3));
        sort(test2);
        System.out.print("Final sequence is: ");
        for (int x = 0; x < test3.length; x++) {
            System.out.print(test3[x] + " ");
        }
        System.out.println("");
        System.out.println(AbstractSortingAlgorithm.isSorted(test3));
        System.out.println("");
    }
}

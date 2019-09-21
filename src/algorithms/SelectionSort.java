package algorithms;

import core.AbstractSortingAlgorithm;

public class SelectionSort {

    public static void sort(int[] arr) {
        // In every iteration, the array would be sorted from 0 to index - 1.
        for (int iteration = 0; iteration < arr.length; iteration++) {
            int min = arr[iteration];
            int minInd = iteration;
            // Find the smallest element within the rest of the array that isn't sorted yet starting at index.
            for (int index = iteration + 1; index < arr.length; index++) {
                if (arr[index] < min) {
                    min = arr[index];
                    minInd = index;
                }
            }
            swap(arr, iteration, minInd);
        }
    }

    // Places the smallest element in the unsorted part of the array where it should be.
    public static void swap(int[] arr, int iteration, int minInd) {
        int temp = arr[iteration];
        arr[iteration] = arr[minInd];
        arr[minInd] = temp;
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

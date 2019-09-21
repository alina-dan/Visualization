package core;

import java.util.List;;

public class AbstractSortingAlgorithm {

    public static boolean isSorted(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return true;
        }
        for (int index = 0; index < arr.length - 1; index++) {
            if (arr[index] > arr[index + 1]) {
                return false;
            }
        }
        return true;
    }
}

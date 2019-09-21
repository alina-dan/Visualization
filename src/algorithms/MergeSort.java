package algorithms;

import java.util.ArrayList;

public class MergeSort {

    public void sort(int[] arr, int left, int right) {
        if (arr.length >  1) {
            int middle = (left + right) / 2;
            sort(arr, left, middle);
            sort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    private void merge(int[] arr, int left, int middle, int right) {
        int splitLeft = middle + 1 - left;
        int splitRight = right - middle;
        int[] tempLeft = new int[splitLeft];
        int[] tempRight = new int[splitRight];
    }

    private int[] copyArr(int[] arr, int to, int from, int[] dest) {
        for (int i = to; i < from; i++){
            dest[i] = arr[i];
        }
        return dest;
    }

}

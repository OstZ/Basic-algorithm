package DSA.Sort;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] arr){
        partition(arr, 0, arr.length - 1);
    }
    private static void partition(int[] arr, int lo, int hi){
        if(lo >= hi) return;
        int i = lo, j = hi + 1;
        //choose pivot
        int mid = lo + (hi - lo) / 2;
        int pivot = arr[mid];
        arr[mid] = arr[lo];
        arr[lo] = pivot;
        //partition
        while(i < j){
            while(++i <= hi && arr[i] < pivot){};
            while(--j >= lo && arr[j] > pivot){};
            if(i < j){
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        arr[lo] = arr[j];
        arr[j] = pivot;

        partition(arr, lo, j - 1);
        partition(arr, j + 1, hi);
    }
}

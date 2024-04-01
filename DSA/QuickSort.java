package DSA;

public class QuickSort {
    public static void sort(int[] arr){
        partition(arr, 0, arr.length - 1);
    }
    private static void partition(int[] arr, int lo, int hi){
        if(lo >= hi) return;
        int pivot = arr[(hi - lo) / 2 + lo];
        int l = lo, r = hi;
        int tmp = 0;
        while (l < r){
            while(arr[l] <= pivot && l <= hi) l++;
            while (arr[r] >= pivot && r >= lo) r--;
            tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
        }
        partition(arr, lo, r - 1);
        partition(arr, r + 1, hi);
    }
}

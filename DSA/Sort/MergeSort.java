package DSA.Sort;

public class MergeSort {
    public static void sort(int[] arr){
        int[] aux= new int[arr.length];
        merge(arr, aux, 0, arr.length);
    }
    private static void merge(int[] arr, int[] aux, int lo, int hi){
        if(hi - lo <= 1) return;
        int mid = lo + (hi - lo) / 2;
        merge(arr, aux, lo, mid);
        merge(arr, aux, mid, hi);
        //3 pointer
        int i = lo, j = mid;
        for(int k = lo; k < hi; ++k){
            if(i == mid) aux[k] = arr[j++];
            else if(j == hi) aux[k] =arr[i++];
            else if(arr[i] < arr[j]) aux[k] = arr[i++];
            else aux[k] = arr[j++];
        }
        for(int t = lo; t < hi; ++t) arr[t] = aux[t];
    }
}

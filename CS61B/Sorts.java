package CS61B;

public class Sorts {
    public static void selectSort(int[] argArr){
        for(int i = 0; i < argArr.length - 1; ++i){
            int tmpMin = argArr[i];
            int tmpMinIdx = i;
            for(int j = i + 1; j <= argArr.length - 1; ++j){
                if(argArr[j] < tmpMin) { tmpMin = argArr[j]; tmpMinIdx = j; }
            }
            argArr[tmpMinIdx] = argArr[i];
            argArr[i] = tmpMin;
        }
    }
    public static void qsort(int[] arr){
        quicksort(arr, 0, arr.length - 1);
    }
    private static void quicksort(int[] arr, int lo, int hi){
        if(lo >= hi) return;
        int i = lo, j = hi + 1, idx,pivot;
        idx = lo + (hi - lo) / 2;
        pivot = arr[idx];
        arr[idx] = arr[lo];
        arr[lo] = pivot;
        while(i < j){
            while(arr[++i] < pivot){}
            while(arr[--j] > pivot){}
            if(i < j){
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        arr[lo] = arr[j];
        arr[j] = pivot;
        quicksort(arr, lo, j - 1);
        quicksort(arr, j + 1, hi);
    }
    public static void shuffle(int[] arr){
        for(int i = 0; i < arr.length; ++i){
            int r = i + (int)(Math.random() * (arr.length - i));
            int tmp = arr[i];
            arr[i] = arr[r];
            arr[r] = tmp;
        }
    }
    public static void prtarr(int[] arr){
        System.out.print('[');
        for(int i : arr) System.out.print(i + " ");
        System.out.print(']');
    }
}

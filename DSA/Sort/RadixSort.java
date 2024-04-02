package DSA.Sort;

public class RadixSort {
    public static void sort(int[] arr){
        //find max
        int max = 0;
        for (int j : arr) if (j > max) max = j;
        //sort according to digits
        for(int exp = 1; max / exp > 0; exp *= 10) count(arr, exp);
    }
    private static void count(int[] arr, int exp){
        int[] aux = new int[arr.length];
        int[] cnt = new int[10];
        //count targeting digit
        for (int j : arr) cnt[j / exp % 10]++;
        //get cumulative
        for(int i = 1; i < 10; ++i) cnt[i] += cnt[i - 1];
        //set numbers in arr to correct position
        for(int i = arr.length - 1; i >= 0; --i){
            int tmp = arr[i] / exp % 10;
            aux[cnt[tmp] - 1] = arr[i];
            cnt[tmp]--;
        }
        for(int i = 0; i < arr.length; i++) arr[i] = aux[i];
    }
}

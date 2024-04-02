package DSA.Sort;

public class InsertSort {
    public static void sort(int[] arr){
        for(int i = 1; i < arr.length; ++i){
            int tmp = arr[i];
            int j = i;
            while(j > 0 && tmp < arr[j-1]){
                arr[j] = arr[j - 1];
                j--;
            }
            if(j != i) arr[j] = tmp;
        }
    }
}

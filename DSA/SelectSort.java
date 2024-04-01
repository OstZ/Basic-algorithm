package DSA;

public class SelectSort {
    public static void sort(int[] arr){
        for(int i = 0; i < arr.length - 1; ++i){
            int tmpMin = arr[i];
            int idx = i;
            for(int j = i + 1; j < arr.length; ++j)
                if(arr[j] < tmpMin){
                    tmpMin = arr[j];
                    idx = j;
                }
            if(idx > i){
                arr[idx] = arr[i];
                arr[i] = tmpMin;
            }
        }
    }
}

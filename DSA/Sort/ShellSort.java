package DSA.Sort;

public class ShellSort {
    public static void sort(int[] arr){
        for(int step = arr.length / 2; step > 0; step /= 2)
            for(int i = step; i < arr.length; i++){
                int j = i;
                int tmp = arr[i];
                while(j - step >= 0 && tmp < arr[j - step]) {
                    arr[j] = arr[j - step];
                    j -= step;
                }
                if(j != i){
                    arr[j] = tmp;
                }
            }
    }
    public static void sortRaw(int[] arr){
        for(int step = arr.length / 2; step > 0; step /= 2)
            for(int i = step; i < arr.length; i++)
                for(int j = i - step; j >= 0; j -= step){
                    if(arr[j] > arr[j + step]){
                        int tmp = arr[j];
                        arr[j] = arr[j + step];
                        arr[j + step] = tmp;
                    }
                }
    }
}

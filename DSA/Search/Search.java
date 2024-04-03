package DSA.Search;

public class Search {
    public static int binSearch(int[] arr, int val){
        int i = 0, j = arr.length;
        while(i < j){
            int mid = i + (j - i) / 2;
            if(arr[mid] > val) j = mid;
            else if(arr[mid] == val) return mid;
            else i = mid + 1;
        }
        return i;
    }
    public static int interPolationSearch(int[] arr, int key){
        int lo = 0, hi = arr.length - 1, mid;
        while(lo < hi){
            mid = lo + (key - arr[lo]) * (hi - lo) / (arr[hi] - arr[lo]);
            if(arr[mid] == key) return mid;
            else if(arr[mid] > key) hi = mid + 1;
            else lo = mid + 1;
        }
        return -1;
    }
}

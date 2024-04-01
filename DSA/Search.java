package DSA;

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
}

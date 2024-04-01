package Leetcode;

public class LeetCode {
    public static int missingNumber(int[] nums) {
        sort(nums);
        int flag = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i) {
                flag++;
                break;
            }
        }
        return flag;
    }
    private static void sort(int[] arr){
        for(int step = arr.length / 2; step > 0; step /= 2){
            for(int i = step; i < arr.length; ++i){
                int tmp = arr[i];
                int j = i;
                while(j - step >= 0 && tmp < arr[j - step]){
                    arr[j] = arr[j - step];
                    j = j - step;
                }
                if(i != j){
                    arr[j] = tmp;
                }
            }
        }
    }
}

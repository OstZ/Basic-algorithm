package JAVA;

import edu.princeton.cs.algs4.In;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class ArrInsert {
    /*
    insert value and keep sorted
     */
    public static int[] insert(int[] arr, int value){
        //find position of value
        int[] newArr = new int[arr.length + 1];
        //add value
        int j = 0;
        boolean flag = false;
        for(int i = 0; i < arr.length + 1; ++i){
            if((j == arr.length || arr[j] >= value) && !flag){
                newArr[i] = value;
                flag = true;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        Integer[] arr = {2, 6, 1, 3, 9, 8, 5};
        int[] intArr = {10, 2, 8, 4, 1, 9, 3};
        Arrays.sort(arr, new Comparator<>() {
            @Override
            public int compare(Integer t0, Integer t1) {
                return t1 - t0;
            }
        });
//        mySort(intArr, new Comparator<Integer>(){
//            @Override
//            public int compare(Integer o1, Integer o2){
//                return o1 - o2;
//            }
//        });
//        System.out.println(Arrays.toString(intArr));
        Date d0 = new Date();
        SimpleDateFormat sdf0 = new SimpleDateFormat("yyyy-MM-dd: HH-mm-ss");
        System.out.println(sdf0.format(d0));
    }
    public static void mySort(int[] arr, Comparator c){
        for(int i = arr.length - 1; i >= 0 ; --i)
            for(int j = 0; j < i; ++j){
                if(c.compare(arr[j], arr[j + 1]) > 0){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
    }
}

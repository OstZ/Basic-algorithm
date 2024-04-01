package JAVA;

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
}

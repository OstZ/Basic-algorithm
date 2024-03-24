package CodeTest;

//public class cards {
//    public static void main(String[] args) {
//        String[] arr = {"S", "H", "C", "D"};
//        for(String s : arr){
//            for(int i = 1; i < 14; ++i){
//                System.out.print("\"" + s + i + "\"" + ", ");
//            }
//        }
//    }
//}
import CS61B.Sorts;

import java.util.Scanner;

public class cards {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        int[] arr1 = new int[20];
        int[] arr2 = new int[20];
        int c = getDigit(arr1, num);
        Sorts.prtarr(arr1);
    }
    private static int getDigit(int[] arr, long num){
        int i = 0;
        while(num > 0){
            arr[i] = (int) (num % 10);
            num /= 10;
            i++;
        }
        return i;
    }
}
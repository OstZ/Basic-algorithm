package DSA.Recursion;

import CS61B.Sorts;

public class EightQueen {
    private int cnt = 0;
    private static int[] arr = new int[8];
    public void judge(int row){
        if(row == 8){
            Sorts.prtarr(arr);
            System.out.println();
            cnt++;
            return;
        }
        for(int i = 0; i < 8; ++i){
            if(check(i, row)){
                arr[row] = i;
                judge(row + 1);
            }
            arr[row] = 0;
        }
    }
    public boolean check(int col, int row){
        for(int i = 0; i < row; ++i)
            if(arr[i] == col || row - i == Math.abs(col - arr[i]))
                return false;
        return true;
    }

    public static void main(String[] args) {
        EightQueen eq= new EightQueen();
        eq.judge(0);
        System.out.println(eq.cnt);
    }
}

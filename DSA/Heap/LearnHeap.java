package DSA.Heap;

public class LearnHeap {
    public static void buildHeap(int[] arr, int len){
        for(int i = len/2; i > 0; i--)
            heapAdj(arr, i, len);
    }
    public static void heapAdj(int[] arr, int pos, int len){
        //利用空置的0号位，暂存当前根结点
        arr[0] = arr[pos];
        //在当前子树中，沿较大值的方向调整
        //假设除了根结点和两个直接子结点外，都已经满足堆
        for(int i = pos * 2; i <= len; i *= 2){
            //找到当前两个子结点中较大的一个
            if(i < len && arr[i] < arr[i + 1]) ++i;
            //与暂存值比较，如果小于暂存值则已经是堆，暂存值
            //应该处于pos位置
            if(arr[i] <= arr[0]) break;
            //如果子结点的值大于暂存值，则需要交换，将
            //子结点的值换到根结点，继续往下寻找暂存值的
            //正确位置
            else{
                arr[pos] = arr[i];
                pos = i;
            }
        }
        //将暂存值放到正确位置
        arr[pos] = arr[0];
    }

    public static void main(String[] args) {

    }
}

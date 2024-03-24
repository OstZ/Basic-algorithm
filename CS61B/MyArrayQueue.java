package CS61B;

public class MyArrayQueue {
    private int head;
    private int tail;
    private int [] arr;

    public MyArrayQueue(int arrSize){
        arr = new int[arrSize];
        head = 0;
        tail = 0;
    }
    public boolean isFull(){
        return (tail + 1) % arr.length == head;
    }
    public boolean isEmpty(){
        return  head == tail;
    }
    public void addQueue(int n){
        if(isFull()){
            System.out.println("FUll!!!");
            return;
        }
        arr[tail] = n;
        tail = (tail + 1) % arr.length;
    }
    public int getQueue(){
        if(isEmpty()){
            throw new RuntimeException("Empty");
        }
        int tmp = arr[head];
        head = (head + 1) % arr.length;
        return tmp;
    }
    public void show(){
        if(isEmpty()){
            System.out.println("empty!!");
            return;
        }
        for(int i = head; i != tail; ){
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
            i = (i + 1) % arr.length;
        }
    }
    public int first(){
        if(isEmpty()){
            throw new RuntimeException("EMPTY!!!");
        }
        return arr[head];
    }
}

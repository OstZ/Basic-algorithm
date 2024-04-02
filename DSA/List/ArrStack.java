package DSA.List;

public class ArrStack {
    private int[] stack;
    private int size;
    private int cur = -1;
    public ArrStack(){
        stack = new int[10];
    }
    public ArrStack(int n){
        stack  = new int[n];
    }
    public void push(int i){
        if(cur >= stack.length - 1) return;
        stack[++cur] = i;
        size++;
    }
    public int pop(){
        if(size == 0) throw new RuntimeException("empty");
        size--;
        return stack[cur--];
    }
    public int size() { return size; }
    public boolean isEmpty(){ return size == 0;}
}

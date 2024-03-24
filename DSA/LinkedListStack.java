package DSA;

public class LinkedListStack<T> {
    private Node head;
    private class Node{
        T val;
        Node next;
        Node(){}
        Node(T item){}
        Node(T item, Node p){
            val = item;
            next = p;
        }
    }
    public LinkedListStack(){
        head = new Node();
    }
    public void push(T item){
        head.next = new Node(item, head.next);
    }
    public T pop(){
        if(isEmpty()) throw new RuntimeException("empty");
        T tmp = head.next.val;
        head.next = head.next.next;
        return tmp;
    }
    public boolean isEmpty(){
        return head.next == null;
    }
}

package DSA;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int size;
    private class Node{
        int no;
        Node pre;
        Node next;
        public Node(){}
        public Node(Node p1, Node p2){
            pre = p1;
            next = p2;
        }
        public Node(int n, Node p1, Node p2){
            no = n;
            pre = p1;
            next = p2;
        }
    }
    public DoubleLinkedList(){
        head = new Node();
        tail = new Node(head,null);
        head.next = tail;
    }
    public DoubleLinkedList(int n){
        Node node = new Node(n,null, null);
        head = new Node(null, node);
        tail = new Node(node, null);
        node.pre = head;
        node.next = tail;
    }
    //add node in tail
    public void addNode(int n){
        Node node = new Node(n,null,null);
        node.next = tail;
        node.pre = tail.pre;
        tail.pre.next = node;
        tail.pre = node;
        size++;
    }
    //add node in kth node
    public void addNode(int k, int n){
        if(k > this.size){
            this.addNode(n);
            return;
        }
        Node node = new Node(n, null, null);
        Node tmp = head;
        while (k > 0){
            tmp = tmp.next;
            k--;
        }
        node.next = tmp;
        node.pre = tmp.pre;
        tmp.pre.next = node;
        tmp.pre = node;
    }

    //find node in n;
    private Node find(int n){
        if(isEmpty()) return null;
        Node tmp = head.next;
        while(tmp != tail){
            if(tmp.no == n) return tmp;
            tmp = tmp.next;
        }
        return null;
    }
    //delete node according to n
    public void delete(int n){
        Node target = this.find(n);
        if(target == null) throw new RuntimeException("no such node");
        target.pre.next = target.next;
        target.next.pre = target.pre;
        size--;
    }
    public boolean isEmpty(){ return head.next == tail;}
    public int size(){ return this.size; }
    public void prtList(){
        Node tmp = head.next;
        while(tmp != tail){
            System.out.print(tmp.no);
            System.out.print(' ');
            tmp = tmp.next;
        }
    }
}

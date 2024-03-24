package DSA;

public class MyList {
    private static class Node{
        private int item;
        private Node next;
        public Node(int in, Node p){
            item = in;
            next = p;
        }
        public Node(){}
    }
    private Node head;
    private int size;

    public MyList(){
        head = new Node(0, null);
    }
    public MyList(int in, Node p){
        head = new Node(0, new Node(in, p));
    }
    //add Node according to in
    public void addNode(int in){
        Node p = head;
        while (p != null && p.next != null){
            if(p.next.item >= in) break;
            p = p.next;
        }
        p.next = new Node(in, p.next);
    }
    //update Node
    public void update(int idx){
        if(head.next == null) throw new RuntimeException("EMPTY LIST");
        Node tmp = head.next;
        while(tmp != null){
            if(tmp.item == idx) /*do something*/ ;
            tmp = tmp.next;
        }
        if(tmp == null) throw new RuntimeException("cant find");
    }
    //delete
    public void delete(int idx){
        if(head.next == null) throw new RuntimeException("EMPTY LIST");
        Node tmp  = head.next;
        Node pre = head;
        while(tmp != null){
            if(tmp.item == idx){
                pre.next = tmp.next;
                break;
            }
            pre = tmp;
            tmp = tmp.next;
        }
        if(tmp == null) throw new RuntimeException("NO this thing");
    }
    //size
    public static int size(MyList ml){
        int i = 0;
        Node head = ml.head.next;
        while(head != null){
            head = head.next;
            i++;
        }
        return i;
    }
    //kth Node from end
    public static int kthRe(MyList myList, int k){
        Node p = myList.head.next;
        Node q = p;
        int i = 0;
        while(p != null){
            p = p.next;
            if(i < k) i++;
            else q = q.next;
        }
        return q.item;
    }
    //reverse
    public static void reverse(MyList ml){
//        Node h = ml.head;
//        Node tmp = h;
//        while(tmp.next != null) tmp = tmp.next;
//        re(h.next).next = null;
//        h.next = tmp;
        Node cur = ml.head;
        Node pre = null;
        while(cur != null){
            Node tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        ml.head = pre;
    }
    private static Node re(Node p1){
        //input first
        //
        if(p1.next == null) return p1;
        Node tmp = re(p1.next);
        tmp.next = p1;
        return p1;
    }
    //reverse print
    public static void rePrt(MyList ml){
        Node head = ml.head;
        reprt(head.next);
    }
    private static void reprt(Node p){
        if(p.next == null) {
            System.out.print(p.item);
            return;
        }
        reprt(p.next);
        System.out.print(p.item);
    }
    //merge sorted linked list
    public static Node merge(MyList ml1, MyList ml2){
        Node h1 = ml1.head.next;
        Node h2 = ml2.head.next;

        return null;
    }

    public void show(){
        Node p = head.next;
        if(p == null) throw new RuntimeException("EMPTY!!!");
        while (p != null){
            System.out.printf("Number: %d\n", p.item);
            p = p.next;
        }
    }
}

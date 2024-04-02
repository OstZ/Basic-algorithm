package DSA.List;

public class CircleSingleLinkedList {
    private int size;
    private Node first;
    private static class Node{
        int n;
        Node next;
        public Node(){};
        public Node(int n){
            this.n = n;
        }
        public Node (int n, Node p){
            this.n = n;
            this.next = p;
        }
    }
    public CircleSingleLinkedList(int n){
        first = new Node(n);
        first.next = first;
        size++;
    }
    public CircleSingleLinkedList(int[] arr){
        int len = arr.length;
        Node cur = first;
        if(len == 0){
            System.out.println("empty arr");
            return;
        }
        for(int i = 0; i < len; ++i){
            Node node = new Node(arr[i], first);
            if(i == 0) { first = cur = node; }
            cur.next = node;
            cur = cur.next;
        }
    }
    //add a node
    public void addNode(int n){
        Node node = new Node(n);
        Node tmp = first;
        while (tmp.next != first){
            tmp = tmp.next;
        }
        node.next = first;
        tmp.next = node;
        size++;
    }
    //add nodes;
    //delete node
    private Node find(int n){
        Node tmp = first;
        while(tmp.next != first){
            if(tmp.n == n) return tmp;
            tmp = tmp.next;
        }
        return tmp;
    }
    public String popM(int m, int k){
        Node tmp = first;
        while(k > 1) {
            tmp = tmp.next;
            k--;
        }
        int cnt = 1;
        StringBuilder sb = new StringBuilder();
        while(tmp != tmp.next){
            if(cnt == m - 1) {
                sb.append(tmp.next.n);
                tmp.next = tmp.next.next;
                cnt = 1;
            } else cnt++;
            tmp = tmp.next;
        }
        sb.append(tmp.n);
        return sb.toString();
    }
    public String josepfu(int m, int k){
        StringBuilder sb0 = new StringBuilder();
        Node pre = first;
        int i = 1;
        while(pre.next != first) pre = pre.next;
        while(k > 1){
            pre = pre.next;
            first = first.next;
            k--;
        }
        while(first != pre){
            if(i == m){
                sb0.append(first.n);
                first = first.next;
                pre.next = first;
                i = 1;
            } else {
                i++;
                first = first.next;
                pre = pre.next;
            }
        }
        sb0.append(first.n);
        return sb0.toString();
    }
    public void prtList(){
        Node tmp = first;
        do{
            System.out.print(tmp.n);
            System.out.println(' ');
            tmp = tmp.next;
        }while(tmp != first);
        System.out.println();
    }
}

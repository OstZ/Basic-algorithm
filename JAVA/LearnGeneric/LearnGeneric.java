package JAVA.LearnGeneric;

import java.util.Iterator;
import java.util.PriorityQueue;

public class LearnGeneric <K>{
    private K[] arr = (K[]) (new Object[20]);
    public void setArrElement(K str){
        arr[0] = str;
    }
    public <R> void prt(R r){
        System.out.println(r);
    }

    public static void main(String[] args) {
        LearnGeneric<String> lg = new LearnGeneric<>();
        //lg.setArrElement("8899");
        lg.prt("string");
        PriorityQueue<String> pq0 = new PriorityQueue<>();
        pq0.add("7890");
        pq0.add("1234");
        pq0.add("5678");
        pq0.add("qwer");
        pq0.add("asdf");
        while(!pq0.isEmpty()) System.out.println(pq0.poll());
    }
}

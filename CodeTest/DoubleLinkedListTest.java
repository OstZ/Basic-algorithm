package CodeTest;

import DSA.List.DoubleLinkedList;
import org.junit.Test;

public class DoubleLinkedListTest {
    @Test
    public void testPrt(){
        DoubleLinkedList dll1 = new DoubleLinkedList();
        dll1.addNode(40);
        dll1.addNode(80);
        dll1.delete(40);
        dll1.addNode(1, 30);
        dll1.prtList();
    }
}

package CodeTest;
import org.junit.Test;
import Leetcode.*;
import static org.junit.Assert.*;
public class LeetCodeTest {
    @Test
    public void missingNum(){
        int[] arr = new int[]{3, 0, 1};
        assertEquals(2, LeetCode.missingNumber(arr));
    }
}

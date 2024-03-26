package DSA;

public class KMP {
    public static int[] getNext(String str)
    {
        int len = str.length();
        int q = 1;
        int k = 0;
        int[] next = new int[len];
        next[0] = 0;
        for(; q < len; ++q){
            //find max k at present q
            while(k > 0 && str.charAt(q) != str.charAt(k)) k = next[k-1];
            if(str.charAt(q) == str.charAt(k)){
                ++k;
            }
            next[q] = k;
        }
        return next;
    }

    public static int kmp(String s1, String s2){
        int len1 = s1.length();
        int len2 = s2.length();
        int q = 0;
        int[] next = getNext(s2);
        for(int i = 0; i < len1; ++i){
            while(q > 0 && s1.charAt(i) != s2.charAt(q)) q = next[q - 1];
            if(s1.charAt(i) == s2.charAt(q)){
                ++q;
            }
            if(q == len2) return i - q + 1;
        }
        return -1;
    }
}

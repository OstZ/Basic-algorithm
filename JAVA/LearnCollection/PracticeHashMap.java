package JAVA.LearnCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PracticeHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm0 = new HashMap<>();
        hm0.put("jack", 650);
        hm0.put("tom", 1200);
        hm0.put("smith", 2900);
        System.out.println(hm0);
        hm0.put("jack", 2600);
        System.out.println(hm0);
        Set<Map.Entry<String, Integer>> entries = hm0.entrySet();
        Iterator<Map.Entry<String, Integer>> enit = entries.iterator();
        while(enit.hasNext()){
            Map.Entry<String, Integer> tmp = enit.next();
            tmp.setValue(tmp.getValue() + 100);
        }
        for(String str : hm0.keySet()) System.out.println(str);
        for(int i : hm0.values()) System.out.println(i);

    }
}

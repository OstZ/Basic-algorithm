package JAVA.LearnCollection;

import edu.princeton.cs.algs4.In;

import java.util.*;

public class LearnCollection {
    public static void main(String[] args) {
        HashMap<String, Integer> hm0 = new HashMap<>();
        Collection<Integer> l0 = new ArrayList<>();
        l0.add(89);
        l0.add(78);
        hm0.put("meme", 23);
        hm0.put("jack", 89);
        hm0.put("rose", 88);
        hm0.put("mike", 18);
        //loop keys
        Set<String> tmpSet = hm0.keySet();
        Iterator<String> it0= tmpSet.iterator();
        while(it0.hasNext()) System.out.print(it0.next() + " ");
        System.out.println();
        for(String o : tmpSet) System.out.print(o + " ");
        System.out.println();

        //loop values
        Collection<Integer> collect0 = hm0.values();
        for(Integer i : collect0) System.out.print(i + " ");
        System.out.println();
        Iterator<Integer> it1 = collect0.iterator();
        while(it1.hasNext()) System.out.print(it1.next() + " ");
        System.out.println();

        //loop entry
        Set<Map.Entry<String, Integer>> entries = hm0.entrySet();
        for(Map.Entry<String, Integer> en : entries) System.out.print(en + " ");
        System.out.println();
        Iterator<Map.Entry<String, Integer>> it2 = entries.iterator();
        while(it2.hasNext()) System.out.print(it2.next() + " ");

        //loop key-value directly from hashmap
        for(int i = 0; i < 63; ++i){
            hm0.put("value:" + i, i);
        }
        //hashtable
        Hashtable<String, Integer> ht0 = new Hashtable<>();
        ht0.put("2333", 89);
        ht0.put("8999", 19);
        System.out.println(ht0);


        List<Integer> list0 = new ArrayList<>();
        list0.add(90);
        list0.add(70);
        list0.add(10);
        list0.get(0);

        TreeSet<String> ts0 = new TreeSet<>();
        ts0.add("lucy");
        ts0.add("jack");
        ts0.add("nancy");
        ts0.add("0000");
        ts0.add("1234");
        ts0.add("3456");
        System.out.println(ts0);

        //treeMap
        TreeMap<String, String> tm0 = new TreeMap<>();
        tm0.put("2333", "9000");
        tm0.put("2345", "80000");
        tm0.put("666", "2050");
        tm0.put("2333", "abc");
        System.out.println(tm0);

    }
}

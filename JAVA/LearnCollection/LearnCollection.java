package JAVA.LearnCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class LearnCollection {
    public static void main(String[] args) {
        Collection<Object> c = new ArrayList<>();
        c.add('O');
        c.add(233);
        c.add(23.3);
        c.add("ok");
        Iterator<Object> it = c.iterator();
        System.out.println(c);


    }
}

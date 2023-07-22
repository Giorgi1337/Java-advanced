package Collection.setinterface;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(5);
        lhs.add(2);
        lhs.add(4);
        lhs.add(9);
        lhs.add(15);

        System.out.println(lhs);
        lhs.remove(2);
        System.out.println(lhs);
        System.out.println(lhs.contains(5));
    }
}

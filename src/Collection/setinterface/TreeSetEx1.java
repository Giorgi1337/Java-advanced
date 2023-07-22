package Collection.setinterface;

import java.util.Set;

public class TreeSetEx1 {
    public static void main(String[] args) {
        Set<Integer> threeset = new java.util.TreeSet<>();

        threeset.add(5);
        threeset.add(8);
        threeset.add(2);
        threeset.add(1);
        threeset.add(10);
        threeset.add(10);

        System.out.println(threeset);
    }
}

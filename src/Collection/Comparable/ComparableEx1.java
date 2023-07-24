package Collection.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableEx1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Anna");
        list.add("George");
        list.add("Elena");

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}

package Collection.stream;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Map {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("how is ?");
        list.add("Something");

//        for (int i = 0; i < list.size(); i ++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }

        List<Integer> list2 = list.stream().map(el -> el.length()).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(list2);

        int[] arr = {5,8,6,2,9};
        arr = Arrays.stream(arr).map(element
                -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();

        System.out.println(Arrays.toString(arr));

        Set<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("how is ?");
        set.add("Something");

        System.out.println(set);

        Set<Integer> set2 =  set.stream().map(el -> el.length()).collect(Collectors.toSet());
        System.out.println(set2);
    }
}

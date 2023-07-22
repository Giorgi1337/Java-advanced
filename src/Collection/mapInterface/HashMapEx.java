package Collection.mapInterface;
import java.util.*;

public class HashMapEx {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();

        map1.put(100,"George");
        map1.put(101,"Anna");
        map1.put(121,"John");
        map1.put(111,"Tim");

        map1.putIfAbsent(132,"John"); // add if it doesn't exist watching result with key

        System.out.println(map1.get(101));
        map1.remove(111);

        System.out.println(map1.containsKey(100)); // search with key
        System.out.println(map1.containsValue("George")); // search with value

        System.out.println(map1.keySet()); // returns keys
        System.out.println(map1.values()); // returns values


        System.out.println(map1);
    }
}

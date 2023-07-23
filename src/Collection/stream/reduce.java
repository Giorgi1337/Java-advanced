package Collection.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class reduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(6);
        list.add(1);

        int result = list.stream().reduce(1,(acc, el) -> acc * el);
        System.out.println(result);
        // 2, 5, 8, 6, 1
        // acc = 1  2  10  80  480 { 480 }
        // el =  2  5   8   6   1

//        List<Integer> list100 = new ArrayList<>();
//        Optional<Integer> o = list100.stream().reduce((acc, el) -> acc * el);
//        if (o.isPresent()) {
//            System.out.println(o.get());
//        }else {
//            System.out.println("Not present");
//        }


        List<String> list3 = new ArrayList<>();

        list3.add("Hello");
        list3.add("how is ?");
        list3.add("Something");

        String result3 = list3.stream().reduce((acc, el) -> acc + " " + el).get();
        System.out.println(result3);

    }
}

package Collection.stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorted {
    public static void main(String[] args) {
        int arr [] = {2,1,5,1,-23,4,25,27,11,15,12};
//        arr =  Arrays.stream(arr).sorted().toArray();
//        System.out.println(Arrays.toString(arr));



//       int result = Arrays.stream(arr).filter(e -> e % 2 == 1)
//               .map(e -> {if (e % 3 == 0) {e = e / 3; }return e ;})
//               .reduce((acc, el) -> acc + el).getAsInt();
//        System.out.println(result);
    }
}

 class Test {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,1,2,3);
//        stream1.filter(el -> {
//            System.out.println("!!!");
//            return el % 2 == 0;
//        }).collect(Collectors.toList());

//        Stream<Integer> stream2 = Stream.of(1,2,3,4,5);
//        Stream<Integer> stream3 = Stream.of(6,7,8,9,10);
//        Stream<Integer> stream4 = Stream.concat(stream2,stream3);
//        stream4.forEach(System.out::println);

        Stream<Integer> stream5 = Stream.of(1,2,3,4,5,6,4,84,5);
//        stream5.distinct().forEach(System.out::println);

//        System.out.println(stream5.count());
//        System.out.println(stream5.distinct().count());
//        System.out.println(stream5.distinct().peek(System.out::println).count());
    }
}

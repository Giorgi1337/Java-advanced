package Collection.stream;

import java.util.Arrays;

public class forEach {
    public static void main(String[] args) {
        int[] arr = {5, 8, 6, 2, 9};
//        Arrays.stream(arr).forEach(el -> {el *= 2;
//            System.out.println(el);});
//        Arrays.stream(arr).forEach(el -> System.out.println(el));
//        Arrays.stream(arr).forEach(System.out::println);
        Arrays.stream(arr).forEach(Util::myMethod);
    }
}

class Util {
    public  static void myMethod(int a) {
        a += 2;
        System.out.println("Element a = " + a);
    }
}


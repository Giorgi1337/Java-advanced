package Collection.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class minmax {
    public static void main(String[] args) {
        Student st1 = new Student("George",'m',21,4,8.8);
        Student st2 = new Student("Anna",'f',25,2,5.8);
        Student st3 = new Student("Zurab",'m',23,3,3.8);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);

//       List<Integer> courses =  students.stream()
//               .mapToInt(el -> el.getCourse())
//               .boxed()  // converts int to Integer
//               .collect(Collectors.toList());
//
//        System.out.println(courses);

        int sum = students.stream().mapToInt(el -> el.getCourse()).sum();
//        System.out.println(sum);

        double average = students.stream().mapToInt(el -> el.getCourse()).average().getAsDouble();
//        System.out.println(average);

        int min = students.stream().mapToInt(el -> el.getCourse()).min().getAsInt();
//        System.out.println(min);
        int max = students.stream().mapToInt(el -> el.getCourse()).max().getAsInt();
//        System.out.println(max);


//        Student min = students.stream().min((x, y) -> x.getAge() - y.getAge()).get();
//        System.out.println(min);
//
//        Student max = students.stream().max((x, y) -> x.getAge() - y.getAge()).get();
//        System.out.println(max);

//        students.stream().filter(e -> e.getAge() > 20).forEach(System.out::println);
//        System.out.println("--------------------------------------");
//        students.stream().filter(e -> e.getAge() > 20).limit(1).forEach(System.out::println);
//        System.out.println("--------------------------------------");
//        students.stream().filter(e -> e.getAge() > 20).skip(1).forEach(System.out::println);
    }
}

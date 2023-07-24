package Collection.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class collect {
    public static void main(String[] args) {
        Student st1 = new Student("George",'m',21,4,8.8);
        Student st2 = new Student("Anna",'f',25,2,5.8);
        Student st3 = new Student("Zurab",'m',23,3,3.8);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);

//        Map<Integer, List<Student>> map =  students.stream().map(el -> {
//            el.setName(el.getName().toUpperCase());
//            return el;
//        }).collect(Collectors.groupingBy(el -> el.getCourse()));
//
//        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()){
//            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
//        }



         Map<Boolean, List<Student>> map =  students.stream().map(el -> {
            el.setName(el.getName().toUpperCase());
            return el;
        }).collect(Collectors.partitioningBy(el -> el.getAvgGrade() > 5 ));

        for (Map.Entry<Boolean, List<Student>> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }


    }
}

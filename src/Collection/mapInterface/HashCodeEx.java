package Collection.mapInterface;

import java.util.*;

public class HashCodeEx {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();

        Student st1 = new Student("Zurab","Dolidze",25);
        Student st2 = new Student("Anna","Jobava",22);
        Student st3 = new Student("Giorgi","Qvatsabaia",21);


        map.put(st1, 90.21);
        map.put(st2, 55.87);
        map.put(st3, 70.22);

        Student st4 = new Student("Giorgi","Qvatsabaia",21);
        Student st5 = new Student("Gela","Bokuchava",33);

        System.out.println(map.containsKey(st1));
        System.out.println(st1.hashCode());
        st1.age = 22;
        System.out.println(map.containsKey(st1));
        System.out.println(st1.hashCode());


//        boolean result = map.containsKey(st4);
//        System.out.println("Result = " + result);

//        System.out.println(st3.equals(st4));

//        System.out.println(st3.hashCode());
//        System.out.println(st4.hashCode());


        for (Map.Entry<Student, Double> entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


        Map<Integer, String> map2 = new HashMap<>(16,0.75f);

//        System.out.println(map);
    }
}

final class Student  implements  Comparable<Student>{
    String name;
    String surname;
    int age;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return age == student.age && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, surname, age);
//    }




    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
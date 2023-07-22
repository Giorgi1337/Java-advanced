package Collection.setinterface;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();

        Student st1 = new Student("George",22);
        Student st2 = new Student("Tim",11);
        Student st3 = new Student("John",23);
        Student st4 = new Student("Zurab",41);

        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);

//        System.out.println(treeSet);
//        System.out.println(treeSet.last()); // 41
//        System.out.println(treeSet.first()); // 11


        Student st5 = new Student("Elena",22);
        Student st6 = new Student("Beqa",53);
        System.out.println(treeSet.subSet(st5,st6)); // showing between two elements

        System.out.println(st1.equals(st5));
        System.out.println(st1.hashCode() == st5.hashCode());
    }
}

class Student implements  Comparable<Student> {
    String name;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student other) {
        return this.age - other.age;
    }
}

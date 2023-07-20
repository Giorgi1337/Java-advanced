package Collection;

import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Student2 st1 = new Student2("Anna",2);
        Student2 st2 = new Student2("Tim",7);
        Student2 st3 = new Student2("John",4);

        LinkedList<Student2> studentlist = new LinkedList<>();
        studentlist.add(st1);
        studentlist.add(st2);
        studentlist.add(st3);

        System.out.println("Student list: " + studentlist);

        Student2 st4 = new Student2("Zaur",2);
        Student2 st5 = new Student2("Elena",4);

        studentlist.add(st4);

        System.out.println("Student list: " + studentlist);

        studentlist.add(1,st5);

        System.out.println("Student list: " + studentlist);

        studentlist.remove(1);

        System.out.println("Student list: " + studentlist);


    }


    static class Student2 {
        String name;
        int course;

        public Student2(String name, int course) {
            this.name = name;
            this.course = course;
        }

        @Override
        public String toString() {
            return "Student2{" +
                    "name='" + name + '\'' +
                    ", course=" + course +
                    '}';
        }
    }
}

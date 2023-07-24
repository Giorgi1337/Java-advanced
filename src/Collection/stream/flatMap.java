package Collection.stream;

import java.util.ArrayList;
import java.util.List;

public class flatMap {
    public static void main(String[] args) {
        Student st1 = new Student("George",'m',21,4,8.8);
        Student st2 = new Student("Anna",'f',25,2,5.8);
        Student st3 = new Student("Zurab",'m',23,3,3.8);


        Faculty f1 = new Faculty("IT");
        Faculty f2 = new Faculty("Math");
        f1.addStudentToFaculty(st1);
        f2.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(f1);
        faculties.add(f2);

        faculties.stream().flatMap(faculty -> faculty.getStudentList().stream())
                .forEach(e -> System.out.println(e.getName()));
    }
}


class Faculty {
    String name;
    List<Student> studentList;

    public Faculty(String name) {
     this.name = name;
     studentList = new ArrayList<>();
    }
    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudentToFaculty(Student st) {
        studentList.add(st);
    }
}


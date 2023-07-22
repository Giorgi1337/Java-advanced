package Collection.mapInterface;

import java.util.HashSet;
import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<Double, Student> hashtable = new Hashtable<>();

        Student st1 = new Student("Zurab","Dolidze",15);
        Student st2 = new Student("Anna","Jobava",22);
        Student st3 = new Student("Giorgi","Qvatsabaia",21);
        Student st4 = new Student("Elena","Prekrasnaya",25);

        hashtable.put(7.8,st1);
        hashtable.put(9.8,st2);
        hashtable.put(5.8,st3);
        hashtable.put(2.8,st4);

        System.out.println(hashtable);
    }
}

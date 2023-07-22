package Collection.mapInterface;
import java.util.*;
public class ThreeMapEx {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();

        Student st1 = new Student("Zurab","Dolidze",15);
        Student st2 = new Student("Anna","Jobava",22);
        Student st3 = new Student("Giorgi","Qvatsabaia",21);
        Student st4 = new Student("Elena","Prekrasnaya",25);
        Student st5 = new Student("Tim","Someone",22);
        Student st6 = new Student("Gela","None",21);


        treeMap.put(5.8,st1);
        treeMap.put(4.2,st2);
        treeMap.put(1.4,st3);
        treeMap.put(9.4,st4);
        treeMap.put(3.2,st5);
        treeMap.put(2.1,st6);
        treeMap.put(3.7,st6);

//        System.out.println(treeMap.get(4.2));
//        treeMap.remove(3.7);

        System.out.println(treeMap);

        System.out.println(treeMap.tailMap(4.2));
        System.out.println(treeMap.tailMap(4.8));

        System.out.println(treeMap.lastEntry());

        System.out.println(treeMap.descendingMap());
    }
}

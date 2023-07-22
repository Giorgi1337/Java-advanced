package Collection.mapInterface;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Double,Student> lhm = new LinkedHashMap<>(16,0.75f,true);

        Student st1 = new Student("Zurab","Dolidze",15);
        Student st2 = new Student("Anna","Jobava",22);
        Student st3 = new Student("Giorgi","Qvatsabaia",21);
        Student st4 = new Student("Elena","Prekrasnaya",25);



        lhm.put(5.8,st1);
        lhm.put(4.2,st2);
        lhm.put(1.4,st3);
        lhm.put(9.4,st4);

        System.out.println(lhm);

        System.out.println(lhm.get(1.4));
        System.out.println(lhm.get(4.2));

        System.out.println(lhm);
    }
}

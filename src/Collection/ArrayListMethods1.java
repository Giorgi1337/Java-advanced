package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Anna");
        arrayList1.add("Tim");
        arrayList1.add("Elena");

        Iterator<String> iterator = arrayList1.iterator();

        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayList1);

//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("???");
//        arrayList2.add("!!!");

//        arrayList1.addAll(1, arrayList2);



//        System.out.println(arrayList1.lastIndexOf("Elena"));
    }
}

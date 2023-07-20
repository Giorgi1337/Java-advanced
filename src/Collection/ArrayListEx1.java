package Collection;
import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Anna");
        arrayList1.add("Tim");

        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(100);

        arrayList2.add("Sasha");
        arrayList2.add("John");

        ArrayList<String> arrayList3 = new ArrayList<>(arrayList1);

        System.out.println(arrayList3);

        System.out.println(arrayList1 == arrayList3);

    }
}

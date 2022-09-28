package lesson12;

import java.util.ArrayList;
import java.util.Collection;

public class MainDZ {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList2.add(3);
        arrayList2.add(4);
        arrayList2.add(5);

        CollectionsUtils collectionsUtils = new CollectionsUtils();

        Collection<Integer> union = collectionsUtils.union(arrayList1, arrayList2);
        Collection<Integer> i = collectionsUtils.intersection(arrayList1, arrayList2);

        System.out.println(union);
    }
}

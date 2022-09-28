package lesson12;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        long startList = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add("qwe" + i);
        }
        System.out.println("ArrayList time " + (System.currentTimeMillis() - startList));

        long startLinkedList = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add("qwe" + i);
        }
        System.out.println("LinkedList time " + (System.currentTimeMillis() - startLinkedList));


        long startListGet = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.get(i);
        }
        System.out.println("ArrayList time " + (System.currentTimeMillis() - startListGet));

        long startLinkedListGet = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.get(i);
        }
        System.out.println("LinkedList time " + (System.currentTimeMillis() - startLinkedListGet));

    }
}

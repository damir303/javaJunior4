package lesson12;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<>();
        arr.add(3);
        arr.add(5);
        arr.add(7);

        arr.add(0, 111);

        arr.set(0, 222);

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(3);
        arr1.add(5);
        arr1.add(7);

        arr1.add(0, 111);

        arr1.set(0, 222);

        System.out.println(arr.equals(arr1));
        System.out.println(arr.contains(7));
    }
}

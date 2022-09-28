package lesson14;

import java.util.HashMap;
import java.util.TreeMap;

public class Main1 {
    public static void main(String[] args) {

//        TreeMap<Integer, Student> map = new TreeMap<>();
//
//        Student student = new Student("Petya", 23);
//        Student student1 = new Student("Vasya", 34);
//        Student student2 = new Student("Kuzya", 23);
//        Student student3 = new Student("Vasya", 23);
//
//        map.put(4, student);
//        map.put(5, student1);
//        map.put(89, student2);
//        map.put(1, student3);

        TreeMap<Student,Integer> map = new TreeMap<>();

        Student student = new Student("Petya", 23);
        Student student1 = new Student("Vasya", 34);
        Student student2 = new Student("Kuzya", 23);
        Student student3 = new Student("Vasya", 23);


        map.put(student, 4);
        map.put(student1, 5);
        map.put(student2, 3);
        map.put(student3, 1);

        System.out.println(map);
    }
}

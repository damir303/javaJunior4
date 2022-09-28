package lesson15;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Tovar tovar1 = new Tovar("Телефон",10000);
        Tovar tovar2 = new Tovar("Микроволновка",4500);
        Tovar tovar3 = new Tovar("Телик",20000);
        Tovar tovar4 = new Tovar("Самокат",20000);
        Tovar tovar5 = new Tovar("Ведро",100);

        Otziv otziv = new Otziv(5,"Супер телефон");
        Otziv otziv1 = new Otziv(3,"телефон не то не се");
        Otziv otziv2 = new Otziv(5,"Укатил на самокате от бывшей");
        Otziv otziv3 = new Otziv(4,"Ведро протикает");

        Obzor obzor = new Obzor("Обзор на краш тест","qwe");

        tovar1.addOtziv(otziv);
        tovar1.addOtziv(otziv1);
        tovar3.addOtziv(otziv2);
        tovar5.addOtziv(otziv3);

        tovar1.addObzor(obzor);
        tovar3.addObzor(obzor);
        tovar5.addObzor(obzor);

        TreeSet<Tovar> tovars = new TreeSet<>();
        tovars.add(tovar1);
        tovars.add(tovar2);
        tovars.add(tovar3);
        tovars.add(tovar4);
        tovars.add(tovar5);

        System.out.println(tovars);
        System.out.println("--------------------------------");

        TreeSet<Tovar> sortTovars = Tovar.sortByPriceToFrom(tovars);
        System.out.println(sortTovars);

        System.out.println("--------------------------------");

        TreeSet<Tovar> sortTovarsname = Tovar.sortByNameFromTo(tovars);
        System.out.println(sortTovarsname);


        System.out.println("--------------------------------");

        TreeSet<Tovar> sortTovarsname1 = Tovar.sortByPriceToFrom(tovars);
        System.out.println(sortTovarsname1);
    }
}

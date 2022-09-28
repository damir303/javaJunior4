package lesson5;

public class Ture {
    public static void getCoutry(String[][] mass, String name) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i][0].equals(name)) {
                System.out.println("Направление " + mass[i][0] + " отель " + mass[i][1] +
                        " добираться " + mass[i][2] + " Цена " + mass[i][3]);
            }
        }
    }

    public static void getCoutry(String[][] mass, String name, int summ) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i][0].equals(name)
                    && Integer.parseInt(mass[i][3]) < summ) {
                System.out.println("Направление " + mass[i][0] + " отель " + mass[i][1] +
                        " добираться " + mass[i][2] + " Цена " + mass[i][3]);
            }
        }
    }

    public static int getTyreStars(String[][] mass, int s) {
        int coll = 0;
        for (int i = 0; i < 7; i++) {
            if (Integer.parseInt(mass[i][1]) == s) {
                coll++;
            }
        }
        System.out.println(coll);
        return coll;
    }

    public static void getTurePrice(String[][] mass, int a, int b) {
        for (int i = 0; i < mass.length; i++) {
            if (Integer.parseInt(mass[i][3]) > a
                    && Integer.parseInt(mass[i][3]) < b) {
                System.out.println("Направление " + mass[i][0] + " отель " + mass[i][1] +
                        " добираться " + mass[i][2] + " Цена " + mass[i][3]);
            }
        }
    }
    public static void getTureTransport(String[][] turs, String s){
        for (int i = 0; i < turs.length; i++) {
           if(!turs[i][2].equals(s) ){
               System.out.println("Направление " + turs[i][0] + " отель " + turs[i][1] +
                       " добираться " + turs[i][2] + " Цена " + turs[i][3]);
           }
        }
    }
}

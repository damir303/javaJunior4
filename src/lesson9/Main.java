package lesson9;

public class Main {
    public static void main(String[] args) {
        //Transport matiz = new Transport();
        Avto oka = new Avto();
        Moto mot = new Moto();

        Transport[] qwe = new Transport[10];
        qwe[0] = oka;
        qwe[1] = mot;
        for (int i = 0; i < qwe.length; i++) {
            qwe[i].isSport();
        }

    }
}

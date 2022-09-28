package lesson9;

public class Main2 {
    public static void main(String[] args) {
        Figura f = new Figura();
        Treugolnik t = new Treugolnik();

        Figura[] arr = new Figura[]{f, t};
        for (int i = 0; i < arr.length; i++) {
            arr[i].printPlosad();
            arr[i].printObem();
            System.out.println();
        }


    }
}

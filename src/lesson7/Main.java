package lesson7;

public class Main {
    public static void main(String[] args) {

        Pasport mug = new Pasport("Vasy", 123321, "Kazan", "под мостом");
        Pasport gena = new Pasport("Oly", 321123, "kazan", "над мостом");
        mug.setGena(gena);

        System.out.println(1);
    }
}

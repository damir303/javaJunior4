package lesson7;

public class Main {
    public static void main(String[] args) {

        Pasport mug = new Pasport("Vasy", 123321, "Kazan", "��� ������");
        Pasport gena = new Pasport("Oly", 321123, "kazan", "��� ������");
        mug.setGena(gena);

        System.out.println(1);
    }
}

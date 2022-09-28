package lesson9;

public class Figura implements iFigura{
    @Override
    public void printObem() {
        System.out.println("подсчте обьема");
    }

    @Override
    public void printPlosad() {
        System.out.println("подсчет площади");
    }
}

package lesson9;

public class Figura implements iFigura{
    @Override
    public void printObem() {
        System.out.println("������� ������");
    }

    @Override
    public void printPlosad() {
        System.out.println("������� �������");
    }
}

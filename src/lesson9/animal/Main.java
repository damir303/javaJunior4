package lesson9.animal;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Animal slon1 = new Animal("Kesha", 33, 2);
        Animal slon2 = new Animal("Kesha", 33, 2);

        System.out.println(slon1.equals(slon2));

        int i = slon1.hashCode();
        Thread.sleep(10);
        int i1 = slon2.hashCode();
        System.out.println(i1 == i);


    }
}

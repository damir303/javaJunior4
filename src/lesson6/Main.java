package lesson6;

public class Main {
    public static void main(String[] args) {

        Treugolnik tr1 = new Treugolnik();

        tr1.setA(4);
        tr1.setB(4);
        tr1.setC(5);

        System.out.println("Треугольник со строноми: а = " + tr1.getA() +
                " b = " + tr1.getB() + " c = " + tr1.getC());

        System.out.println("Периметр = " + tr1.perimetr());

        System.out.println("Площадь = " + tr1.ploshad());

    }
}

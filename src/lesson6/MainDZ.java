package lesson6;

import java.util.Scanner;

public class MainDZ {
    public static void main(String[] args) {

        System.out.println("Выберите фигуру");
        System.out.println("1-треуглольник");
        System.out.println("2-круг");  // 2 PI r  and PI r в квадрате
        System.out.println("3-квадрат");
        System.out.println("4-цилндр");
        System.out.println("5-конус");

        Scanner scanner = new Scanner(System.in);
        int figura = scanner.nextInt();

        switch (figura){
            case 1:
                Treugolnik treugolnik = new Treugolnik();

                System.out.println("Введите а");
                treugolnik.setA(scanner.nextInt());

                System.out.println("Введите b");
                treugolnik.setB(scanner.nextInt());

                System.out.println("Введите c");
                treugolnik.setC(scanner.nextInt());

                System.out.println("Периметр = "+ treugolnik.perimetr());
                System.out.println("Площадь = "+ treugolnik.ploshad());

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            default:
                System.out.println("Нет такой фигуры");
        }



    }
}

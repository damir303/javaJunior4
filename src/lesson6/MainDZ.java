package lesson6;

import java.util.Scanner;

public class MainDZ {
    public static void main(String[] args) {

        System.out.println("�������� ������");
        System.out.println("1-������������");
        System.out.println("2-����");  // 2 PI r  and PI r � ��������
        System.out.println("3-�������");
        System.out.println("4-������");
        System.out.println("5-�����");

        Scanner scanner = new Scanner(System.in);
        int figura = scanner.nextInt();

        switch (figura){
            case 1:
                Treugolnik treugolnik = new Treugolnik();

                System.out.println("������� �");
                treugolnik.setA(scanner.nextInt());

                System.out.println("������� b");
                treugolnik.setB(scanner.nextInt());

                System.out.println("������� c");
                treugolnik.setC(scanner.nextInt());

                System.out.println("�������� = "+ treugolnik.perimetr());
                System.out.println("������� = "+ treugolnik.ploshad());

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
                System.out.println("��� ����� ������");
        }



    }
}

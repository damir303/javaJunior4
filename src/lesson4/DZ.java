package lesson4;

public class DZ {
    public static void main(String[] args) {
//        � ������� ����� For, ���������� �� �������:
//        1) ������ ������ �� -100 �� -50
//        2) ��� ����� � �������� ������� �� 10 �� 30
//        3) ���-�� ������ ����� � ��������� �� 30 �� 61
//        4) *** ��������� ������� ����� ���, ���� ������� ����� � 200� ������, ���� ����������� ���������� �� 9500
//        5) ������� �� ������� ��� ����� �� 20 �� 60, ��������� �������� �� 30 �� 40 ������������

//1
        for (int i = -100; i < -50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        //2
        for (int i = 30; i > 10; i--) {
            System.out.println(i);
        }
        //3
        int summ = 0;
        for (int i = 30; i < 61; i++) {
            if (i % 2 == 0) {
                summ++;
            }
        }
        System.out.println(summ);
        //4
        System.out.println("___________________");
        int mes = 0;
        for (int i = 0; i < 200000; i = i + 9500) {
            mes++;
        }
        System.out.println(mes);
        //5
        System.out.println("___________________");

        for (int i = 20; i < 60; i++) {
            if (i < 30 || i > 40) {
                System.out.println(i);
            }
        }

    }
}

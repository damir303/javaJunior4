package lesson5;

public class Main2 {
    public static void main(String[] args) {
        String[][] turs = {
                {"������", "5", "�������", "30000"},
                {"������", "5", "�������", "40000"},
                {"������", "2", "�����", "25000"},
                {"����", "3", "�������", "10000"},
                {"����", "4", "�����", "60000"},
                {"������", "4", "�������", "20000"},
                {"�������", "5", "�������", "90000"}
        };

        Ture.getCoutry(turs, "������");
        System.out.println("______________");
        Ture.getCoutry(turs, "������", 25000);

        System.out.println("______________");

        int t = Ture.getTyreStars(turs, 5);

        //1)����� � ������� �������� ������ � �������� ���,
        // � ���� ��������� ��� � ���� ��������� ����� 30 � 50 �����
        // 2)����� � ������� �������� ������ � �������� �����   3 � 4 ������������
        // 3) ����� � ������� �������� ������ � �� ��� �� ����� �����
        // ������� ��� ���� ����� ����(�������)

        Ture.getTurePrice(turs,35000, 65000);
        System.out.println();
        Ture.getTureTransport(turs,"�������");



    }
}
package lesson1;

public class Main2 {
    public static void main(String[] args) {
        int a = 55;
        int b = 4;
        int c = 3;


        // ��������������
        // ��������������
        // ����������

        //
        //  ������ �  ������  � ������
        if (a == b && b == c && c == a) {
            System.out.println("�������������� �����������");
        } else if (
                a == b && c != a ||
                        c == b && a != c ||
                        b == c && a != b
        ) {
            System.out.println("�������������� �����������");
        } else if (a + b >= c && a + c >= b && c + b >= a) {
            System.out.println("���������� �����������");
        }
        else {
            System.out.println("�� ���������� ����������");
        }
    }
}

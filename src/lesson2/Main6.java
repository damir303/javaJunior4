package lesson2;

public class Main6 {
    public static void main(String[] args) {
        //������� �� 20 �� 70 ������ �� ������� ������� �� 4 � 7

        for (int i = 20; i < 700; i++) {
            if (i % 4 == 0 && i % 7 == 0) {
                System.out.println("����� ������� �� 4 � 7 = " + i);
            }
        }

        for (int i = 20; i < 700; i++) {
            if (i % 28 == 0) {
                System.out.println("����� ������� �� 4 � 7 = " + i);
            }
        }
    }
}


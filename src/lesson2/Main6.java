package lesson2;

public class Main6 {
    public static void main(String[] args) {
        //вывести от 20 до 70 только те которые делятся на 4 и 7

        for (int i = 20; i < 700; i++) {
            if (i % 4 == 0 && i % 7 == 0) {
                System.out.println("Число делится на 4 и 7 = " + i);
            }
        }

        for (int i = 20; i < 700; i++) {
            if (i % 28 == 0) {
                System.out.println("Число делится на 4 и 7 = " + i);
            }
        }
    }
}


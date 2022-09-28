package lesson2;

public class Main4 {
    public static void main(String[] args) {
        for (int qwe = 1; qwe < 10; qwe++) {
            for (int j = 1; j < 10; j++) {
                int res = qwe * j;
                if (res > 0 && res < 10)
                    System.out.print(res + "   ");
                else if (res >= 10 && res < 100) {
                    System.out.print(res + "  ");
                }else System.out.print(res + " ");
            }
            System.out.println();
        }

    }
}

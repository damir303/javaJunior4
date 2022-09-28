package lesson9;

public class MainDZ {
    public static void main(String[] args) {
        int[] mass = new int[100];
        int count = 1;
        int c2 = 1;
        for (int i = 0; i < mass.length; i++) {

            if (c2 % 7 == 0) {
                mass[i] = count * 3;
            } else {
                mass[i] = count;
            }
            count++;
            c2++;

            if (mass[i] % 10 == 0) {
                System.out.println(mass[i] + " ");
                c2 = 1;
            } else System.out.print(mass[i] + " ");
        }
        System.out.println();

        int c = 1;
        int[][] arr = new int[100][100];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = c;
                c++;
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        int qwe = 2;
        for (int i = 0; i < arr.length; i++) {
            if (qwe % 2 == 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + "  ");

                }
            } else {
                for (int j = arr[i].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + "  ");
                }
            }
            qwe++;
            System.out.println();
        }


    }
}

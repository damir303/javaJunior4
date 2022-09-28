package lesson3;

public class Main8 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.print("*  ");
                } else {
                    System.out.print("0  ");
                }
            }
            System.out.println();

        }
    }
}

package lesson3;

public class Maian9 {
    public static void main(String[] args) {
        int[][] arr = new int[7][7];


        boolean b = true;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (b) {
                    System.out.print("*  ");
                    b = false;
                } else {
                    System.out.print("0  ");
                    b = true;
                }
            }
            System.out.println();

        }
    }
}

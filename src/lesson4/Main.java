package lesson4;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            while (j < arr[i].length) {
                System.out.print(arr[i][j]);
                j++;
            }
            j = 0;
            System.out.println();
            i++;
        }
    }
}

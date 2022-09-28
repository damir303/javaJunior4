package lesson3;

public class Main7 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {4, 5, 6}, {7, 8, 9}};

        int[][] arr1 = new int[4][5];
        //System.out.println(arr[1][2]);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}

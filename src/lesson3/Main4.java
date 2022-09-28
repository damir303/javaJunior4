package lesson3;

public class Main4 {
    public static void main(String[] args) {
        int[] arr = {3, 24, 52, 1, 3, 6, 3, 24, 52, 1};

        for (int i = arr.length - 1; i >= 0; i = i - 2) {
            System.out.println(arr[i]);
        }


    }
}

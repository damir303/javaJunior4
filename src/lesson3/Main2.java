package lesson3;

public class Main2 {
    public static void main(String[] args) {

        int[] arr = new int[123];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

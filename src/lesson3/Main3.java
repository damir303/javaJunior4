package lesson3;

public class Main3 {
    public static void main(String[] args) {
        //������� ������ �� 10
        //������� ������ ������
        int[] arr = {3, 24, 52, 1, 3, 6, 3, 24, 52, 1};


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                System.out.println(arr[i]);
            }
        }

    }
}

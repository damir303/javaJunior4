package lesson4;

public class Main2 {
    public static void main(String[] args) {
        String s = "dfm.hvk.jndfvs.lkdv, fvsdvbs,";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("����� ���");
        } else System.out.println("����� � ���������� " + count);
    }
}

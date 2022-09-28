package lesson4;

public class Main3 {
    public static void main(String[] args) {
        String s = "sdjbnmdsjkxc.sadfbjhsdf.";

        //вывести каждую 3 и если она = точке то вылтать

        for (int i = 0; i < s.length(); i = i + 3) {
            if (s.charAt(i) == '.') {
                break;
            } else {
                System.out.println(s.charAt(i));
            }
        }
    }
}

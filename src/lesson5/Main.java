package lesson5;

public class Main {
    public static void main(String[] args) {
        String[][] strings = new String[3][3];
        char[][] c = new char[5][6];


        String text = "jsdhbvcs adckjb cjahsgchdc, hkjkn  . dsfjbsn d";

        char[] simvol = new char[text.length()];
        // записать текст в массив char[] simvol
        for (int i = 0; i < text.length(); i++) {
            simvol[i] = text.charAt(i);

            System.out.println(simvol[i]);
        }

    }
}

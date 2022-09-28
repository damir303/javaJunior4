package lesson13;

import perService.CustomException;

public class MyStringUtils implements StringUtils {

    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {

        //if () пройтитись по всему number1,number2 и проверить нет ли тут символов.
        //выкидываем NumberFormatException с указанием символа



        char[] chars = number1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 0 || chars[i] <= 9) {
                System.out.println(chars[i]);
            } else {
                throw new NumberFormatException("В number1 имеется символ " + chars[i]);
            }
        }
        char[] chars1 = number2.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] >= 0 && chars1[i] <= 9) {
                System.out.println(chars1[i]);
            } else {
                throw new NumberFormatException("В number2 имеется символ " + chars1[i]);
            }
        }



        return 0;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        return new int[0];
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        return new double[0];
    }
}

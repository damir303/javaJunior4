package lesson13;

import perService.Person;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("����");


        try {
            p.setAge(0);
            p.ageDelenie();
            p.setName("");
        }

        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("����������� �����������");
        }




        System.out.println("��� ");
    }

}

class MainDZ {
    public static void main(String[] args) {
        String number1 = "123";
        String number2 = "sd";

        MyStringUtils myStringUtils = new MyStringUtils();

        try {
            double div = myStringUtils.div(number1, number2);

        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("��������� ������� � �����");


        double[] d = {2.4, 5.3, 6.7 };
    }
}

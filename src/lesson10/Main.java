package lesson10;

public class Main {
    public static void main(String[] args) {
        Rastenia rastenia = new Rastenia();
        Kornevie kornevie = new Kornevie();
        Vodorosli vodorosli = new Vodorosli
                ("�������", "��������", "�������� ��� ����", false);
        Mhi mhi = new Mhi
                ("����������","�����������","��� �����", true);
        Paporotnik paporotnik = new Paporotnik
                ("�������","�������","� ������",true,true,  true);
        Derevo derevo = new Derevo
                ("�������","�������","�� �����",true,true,"�������");


        Rastenia[] arr = new Rastenia[]{mhi,derevo,paporotnik,vodorosli};

        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i].toString());
        }
    }
}

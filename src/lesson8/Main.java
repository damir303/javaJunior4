package lesson8;

public class Main {
    public static void main(String[] args) {
/*
        �� ��� ����������� ���������.
        ����� ������� ���������, ��� ��������� � ��������.
    ��������� ��� ������������ � ������� � �������.
    ����� ������� ������ ����.
        1) main ��������� ���������.
        2) page - ��� ��������� � �����������.
        3) wallEnty ������ �� �����, �������� ��������.
        4) comments  �������, �������� ������ �� �����.
        5)����� ��� ������������.
        6) ����� ������� ������� � ������������ ����������� ������.
                */
        Comments c1 = new Comments("qwe", 3);
        Comments c2 = new Comments("asd", 4);
        Comments c3 = new Comments("zxc", 99);
        Comments c4 = new Comments("qaz", 44);

        Comments[] arrCom = new Comments[]{c1, c2, c3};
        Comments[] arrCom1 = new Comments[]{c2, c3, c4};
        Comments[] arrCom2 = new Comments[]{c1, c3};

        WallEnty zapis1 = new WallEnty("asdfhjgsjdh", "kartina1", arrCom);
        WallEnty zapis2 = new WallEnty("sdfgsdfw", "kartina2", arrCom1);
        WallEnty zapis3 = new WallEnty("gf4er5gwe", "kartina3", arrCom2);

        WallEnty[] z = new WallEnty[]{zapis1, zapis2, zapis3};
        Page myStranica = new Page("DAmir", 99, "kazan", z);

        myStranica.prinMaxLike();

    }
}

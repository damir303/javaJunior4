package lesson2;

public class Main2 {
    public static void main(String[] args) {
        int metka = 6;

        if(metka == 5){
            System.out.println("�������");
        }
        else if(metka == 4){
            System.out.println("������");
        }
        else if(metka == 3){
            System.out.println("���������");
        }
        else if(metka == 2){
            System.out.println("��� �����");
        }
        else {
            System.out.println("��� �� ������");
        }

        switch (metka){
            case 5:
                System.out.println("�������");
                break;
            case 4:
                System.out.println("������");
                break;
            case 3:
                System.out.println("�����");
                break;
            case 2:
                System.out.println("��� �����");
                break;
            default:
                System.out.println("��� �� ������");
        }
        //break ���������� ����



    }
}

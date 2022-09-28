package lesson2;

public class Main2 {
    public static void main(String[] args) {
        int metka = 6;

        if(metka == 5){
            System.out.println("Отлично");
        }
        else if(metka == 4){
            System.out.println("Хорошо");
        }
        else if(metka == 3){
            System.out.println("Нормально");
        }
        else if(metka == 2){
            System.out.println("учи уроки");
        }
        else {
            System.out.println("Это не оценка");
        }

        switch (metka){
            case 5:
                System.out.println("Отлично");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 3:
                System.out.println("Плохо");
                break;
            case 2:
                System.out.println("Учи уроки");
                break;
            default:
                System.out.println("Это не оценка");
        }
        //break выкидывает сюда



    }
}

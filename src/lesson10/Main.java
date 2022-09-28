package lesson10;

public class Main {
    public static void main(String[] args) {
        Rastenia rastenia = new Rastenia();
        Kornevie kornevie = new Kornevie();
        Vodorosli vodorosli = new Vodorosli
                ("Красные", "делением", "подходит для суши", false);
        Mhi mhi = new Mhi
                ("Оранженвый","почкованием","под полом", true);
        Paporotnik paporotnik = new Paporotnik
                ("Зеленые","корнями","в горшке",true,true,  true);
        Derevo derevo = new Derevo
                ("Зеленые","корнями","На улице",true,true,"Хвойные");


        Rastenia[] arr = new Rastenia[]{mhi,derevo,paporotnik,vodorosli};

        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i].toString());
        }
    }
}

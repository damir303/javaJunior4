package lesson2;

public class Main7 {
    public static void main(String[] args) throws InterruptedException {
        int dsa = 0;

        for (int day = 0; day < 7; day++) {
            for (int chas = 0; chas < 24; chas++) {
                for (int min = 0; min < 60; min++) {
                    for (int sec = 0; sec < 60; sec++) {
                        System.out.println("Прошло " + day + " дней " +
                                chas + " часов " + min + " минут " + sec + " секунд");
                        Thread.sleep(10);
                    }
                }
            }
        }
        System.out.println("Прошла неделя");
    }
}

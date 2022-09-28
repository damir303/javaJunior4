package lesson1;

public class Main2 {
    public static void main(String[] args) {
        int a = 55;
        int b = 4;
        int c = 3;


        // равносторонний
        // равнобедренный
        // правильный

        //
        //  правда и  правда  и правда
        if (a == b && b == c && c == a) {
            System.out.println("Равносторонний треугольник");
        } else if (
                a == b && c != a ||
                        c == b && a != c ||
                        b == c && a != b
        ) {
            System.out.println("Равнобедренный треугольник");
        } else if (a + b >= c && a + c >= b && c + b >= a) {
            System.out.println("Правильный треугольник");
        }
        else {
            System.out.println("Не правильный треуольник");
        }
    }
}

package lesson6;

public class Krug {
    private int diamtr;

    public void setDiamtr(int diamtr) {
        this.diamtr = diamtr;
    }

    public int getDiamtr() {
        return diamtr;
    }

    public double perimtr() {
        return Math.PI * diamtr;
    }

    public double plosad() {
        return Math.PI * diamtr / 2 * diamtr / 2;
    }
}

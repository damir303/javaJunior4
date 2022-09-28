package lesson10;

public class Mhi extends Rastenia {
    private boolean stebel;

    public Mhi() {
    }

    public Mhi(String listya, String razmn, String osben, boolean stebel) {
        super(listya, razmn, osben);
        this.stebel = stebel;
    }

    public boolean isStebel() {
        return stebel;
    }

    public void setStebel(boolean stebel) {
        this.stebel = stebel;
    }
}

package lesson10;

public class Paporotnik extends Kornevie {
    private boolean kust;

    public Paporotnik() {
    }

    public Paporotnik(String listya, String razmn, String osben, boolean stebel, boolean koren, boolean kust) {
        super(listya, razmn, osben, stebel, koren);
        this.kust = kust;
    }

    public boolean isKust() {
        return kust;
    }

    public void setKust(boolean kust) {
        this.kust = kust;
    }
}

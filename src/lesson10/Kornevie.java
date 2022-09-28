package lesson10;

public class Kornevie extends  Rastenia {

    private boolean stebel;
    private boolean koren;
    public Kornevie() {
    }
    public Kornevie(String listya, String razmn, String osben, boolean stebel, boolean koren) {
        super(listya, razmn, osben);
        this.stebel = stebel;
        this.koren = koren;
    }

    public boolean isStebel() {
        return stebel;
    }

    public void setStebel(boolean stebel) {
        this.stebel = stebel;
    }

    public boolean isKoren() {
        return koren;
    }

    public void setKoren(boolean koren) {
        this.koren = koren;
    }
}

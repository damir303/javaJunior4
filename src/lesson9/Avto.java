package lesson9;

public class Avto extends Transport {
    boolean sport;

    public Avto() {
    }

    @Override
    public void edet() {
        System.out.println("����");
    }

    public Avto(String name, int col, boolean sport) {
        super(name, col);
        this.sport = sport;
    }

    public boolean isSport() {
        return sport;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }
}

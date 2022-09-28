package lesson10;

public class Vodorosli extends Rastenia {
    private boolean pochva;

    public Vodorosli() {
    }

    public Vodorosli(String listya, String razmn, String osben, boolean pochva) {
        super(listya, razmn, osben);
        this.pochva = pochva;
    }

    public boolean isPochva() {
        return pochva;
    }

    public void setPochva(boolean pochva) {
        this.pochva = pochva;
    }
}

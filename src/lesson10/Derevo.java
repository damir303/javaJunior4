package lesson10;

public class Derevo  extends Kornevie {

    private String type;

    public Derevo() {
    }

    public Derevo(String listya, String razmn, String osben, boolean stebel, boolean koren, String type) {
        super(listya, razmn, osben, stebel, koren);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

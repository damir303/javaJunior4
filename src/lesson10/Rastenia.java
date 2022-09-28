package lesson10;

import java.util.Locale;

public class Rastenia {
    private String listya;
    private String razmn;
    private String osben;

    public Rastenia() {
    }

    public Rastenia(String listya, String razmn, String osben) {

        this.listya = listya.toUpperCase(Locale.ROOT);
        this.razmn = razmn;
        this.osben = osben;
    }

    public String getListya() {
        return listya;
    }

    public void setListya(String listya) {
        this.listya = listya;
    }

    public String getRazmn() {
        return razmn;
    }

    public void setRazmn(String razmn) {
        this.razmn = razmn;
    }

    public String getOsben() {
        return osben;
    }

    public void setOsben(String osben) {
        this.osben = osben;
    }

    @Override
    public String toString() {
        return "Рстения " +
                "Листья='" + listya + '\'' +
                ", Размножение ='" + razmn + '\'' +
                ", Особенности ='" + osben + '\'' +
                '}';
    }
}

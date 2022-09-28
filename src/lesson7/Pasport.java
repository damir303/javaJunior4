package lesson7;

public class Pasport {
    private String name;
    private int nomer;
    private String born;
    private String propiska;
    private Pasport gena;

    public Pasport getGena() {
        return gena;
    }

    public void setGena(Pasport gena) {
        this.gena = gena;
    }

    public Pasport() {
    }

    public Pasport(String name, int nomer, String born, String propiska) {
        this.name = name;
        this.nomer = nomer;
        this.born = born;
        this.propiska = propiska;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getPropiska() {
        return propiska;
    }

    public void setPropiska(String propiska) {
        this.propiska = propiska;
    }
}

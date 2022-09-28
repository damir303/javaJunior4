package lesson8;

public class WallEnty {
    private String zapis;
    private String kartinka;
    private Comments[] comentarii = new Comments[100];

    public WallEnty() {
    }

    public WallEnty(String zapis, String kartinka, Comments[] comentarii) {
        this.zapis = zapis;
        this.kartinka = kartinka;
        this.comentarii = comentarii;
    }

    public String getZapis() {
        return zapis;
    }

    public void setZapis(String zapis) {
        this.zapis = zapis;
    }

    public String getKartinka() {
        return kartinka;
    }

    public void setKartinka(String kartinka) {
        this.kartinka = kartinka;
    }

    public Comments[] getComentarii() {
        return comentarii;
    }

    public void setComentarii(Comments[] comentarii) {
        this.comentarii = comentarii;
    }
}

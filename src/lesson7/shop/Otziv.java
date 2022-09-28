package lesson7.shop;

public class Otziv {
    private int rate;
    private String koment;

    public Otziv() {
    }

    public Otziv(int rate, String koment) {
        this.rate = rate;
        this.koment = koment;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getKoment() {
        return koment;
    }

    public void setKoment(String koment) {
        this.koment = koment;
    }
}

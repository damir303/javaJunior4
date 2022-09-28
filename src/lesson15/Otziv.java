package lesson15;

public class Otziv  {
    private int rate;
    private String komment;

    public Otziv() {
    }

    public Otziv(int rate, String komment) {
        this.rate = rate;
        this.komment = komment;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getKomment() {
        return komment;
    }

    public void setKomment(String komment) {
        this.komment = komment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Otziv otziv = (Otziv) o;

        if (rate != otziv.rate) return false;
        return komment != null ? komment.equals(otziv.komment) : otziv.komment == null;
    }

    @Override
    public int hashCode() {
        int result = rate;
        result = 31 * result + (komment != null ? komment.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Otziv{" +
                "rate=" + rate +
                ", komment='" + komment + '\'' +
                "}";
    }
}

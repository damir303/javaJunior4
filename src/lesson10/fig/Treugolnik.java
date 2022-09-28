package lesson10.fig;

import lesson10.Rastenia;
import lesson9.Figura;

public class Treugolnik extends Figura implements iObem,iPloshd {
    private int a, b, c;
    public final double pi =3.141596;

    @Override
    public double obem() {
        return a*b*c;
    }

    @Override
    public double plosd() {
        return a+b+c;
    }
}


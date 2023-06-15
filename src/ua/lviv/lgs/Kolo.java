package ua.lviv.lgs;

public class Kolo {
    private int r;
    private int d;
    private double pi;

    Kolo(){
        r = 5;
        d = 10;
        pi = 3.14;
    }
    double dov() {
        return (double) (2 * (pi * r));
    }
    double plo() {
        return (double) (pi * r * r);
    }

    @Override
    public String toString() {
        return "Kolo{" + "r=" + r + ", d=" + d + ", pi=" + pi + '}';
    }
}

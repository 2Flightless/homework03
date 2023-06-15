package ua.lviv.lgs;

public class Application {
    public static void main(String[] args){

        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle(2,3);
        Kolo k1 = new Kolo();

        int s = rec1.Square();
        System.out.println("Площа прямокутника="+ s);
        int per = rec1.per();
        System.out.println("Периметр прямокутника="+ per);
        double dov = k1.dov();
        System.out.println("Довжина кола="+ dov);
        double plo = k1.plo();
        System.out.println("Площа кола="+ plo);
    }
}

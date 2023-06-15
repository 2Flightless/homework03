package ua.lviv.lgs;

public class Rectangle {
    private int l;
    private int w;

    Rectangle(){
        l = 10;
        w = 5;
    }
    Rectangle(int l, int w){
        this.l = l;
        this.w = w;
    }
    int Square() {
        return (int)(l * w);
    }
    int per() {
        return (int)(l + l + w + w);
    }
    @Override
    public String toString() {
        return "Rectangle{" + "l=" + l + ", w=" + w + '}';
    }
}

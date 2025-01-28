import java.awt.Graphics;

public class Triangle {
    Point a, b, c;
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void tekenen(Graphics g) {
        System.out.println("Triangle " + this + " being drawn.");   
    }
}

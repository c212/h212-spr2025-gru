import java.awt.Graphics;

public class Line {
    Point start, stop;
    public Line(Point start, Point stop) {
        this.start = start;
        this.stop = stop;
    }
    public void tekenen(Graphics g) {
        System.out.println("Line " + this + " being drawn.");   
    }
}

import java.awt.Graphics;

public class Point {
    static Point origin = new Point();
    int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        this(0, 0);
    }
    public void tekenen(Graphics g) {
        g.drawOval(this.x - 5, this.y - 5, 10, 10);
    }
}

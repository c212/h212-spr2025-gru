import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Scene extends JComponent {
    Point a, d;
    Line b, c;
    Triangle t;
    public Scene() {
        this.a = new Point(30, 50);
        this.d = new Point(300, 250);
        this.b = new Line(a, new Point(20, 30));
        this.c = new Line(Point.origin, new Point(50, 10));
        this.t = new Triangle(new Point(30, 40), new Point(20, 50), new Point(10, 60));
    }
    public void paintComponent(Graphics g) {
        this.a.tekenen(g);
        this.d.tekenen(g);
        this.b.tekenen(g);
        this.c.tekenen(g);
        this.t.tekenen(g);
    }
    public static void main(String[] args) {
        JFrame a = new JFrame("Something");
        a.setVisible(true);
        a.add(new Scene());
        a.setSize(400, 400);
    }
}

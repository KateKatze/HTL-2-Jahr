package at.htlpinkafeld.circlerect;
import ch.aplu.turtle.Turtle;
public class Circle {
    int radius, cx, cy;
    Turtle kate;
    public Circle (int radius, int cx, int cy, Turtle kate) {
        this.radius = radius;
        this.cx = cx;
        this.cy = cy;
        this.kate = kate;
    }
    public void draw() {
        int startCross = 2;
        kate.setPos(cx, cy);
        for (int i = 0; i < 4; i++) {
            kate.forward(startCross);
            kate.right(180);
            kate.forward(startCross);
            kate.right(90);
        }
        kate.setPos(cx, cy + radius);
        kate.rightCircle(radius);
    }
}

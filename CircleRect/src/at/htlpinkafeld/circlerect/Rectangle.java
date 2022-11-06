package at.htlpinkafeld.circlerect;
import ch.aplu.turtle.Turtle;
public class Rectangle {
    int width, height;
    double ulx, uly;
    Turtle kate;
    public Rectangle(int width, int height, double ulx, double uly, Turtle kate) {
        this.width = width;
        this.height = height;
        this.ulx = ulx;
        this.uly = uly;
        this.kate = kate;
    }
    public void draw() {
        kate.setPos(ulx, uly);
        kate.right(90);
        for (int i = 0; i < 2; i++) {
            kate.forward(width);
            kate.right(90);
            kate.forward(height);
            kate.right(90);
        }
    }
}

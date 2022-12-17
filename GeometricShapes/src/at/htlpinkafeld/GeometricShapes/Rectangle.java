package at.htlpinkafeld.GeometricShapes;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(){
        super();
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width + this.height;
    }
}

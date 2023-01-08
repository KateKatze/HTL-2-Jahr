package at.htlpinkafeld.GeometricShapes;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.pow(radius, 2)*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle, area=" + String.format("%.2f", getArea()) + ", Parameters: Radius=" + this.radius;
    }
}

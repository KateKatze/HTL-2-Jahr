package at.htlpinkafeld.GeometricShapes;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(){
        super();
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public double getArea() {
        return this.sideA + this.sideB + this.sideC;
    };
}

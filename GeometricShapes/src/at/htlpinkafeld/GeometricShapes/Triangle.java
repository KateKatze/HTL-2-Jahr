package at.htlpinkafeld.GeometricShapes;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public boolean checkTriangle() {
        return sideA < (sideB + sideC) && sideB < (sideA + sideC) && sideC < (sideA + sideB);
    }

    public double getArea() {
        if(checkTriangle()){
        double s =  (sideA + sideB + sideC)/2;
        double area = Math.sqrt(s*(s-this.sideA)*(s-this.sideB)*(s-this.sideC));
        return area;
        } else {
            System.out.println("This is not a triangle!");
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Triangle, area=" + String.format("%.2f", getArea()) + ", Parameters: sideA=" + this.sideA + ", sideB=" + this.sideB + ", sideC=" + this.sideC;
    }
}

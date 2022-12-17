package at.htlpinkafeld.GeometricShapes;

public class ShapePrinter {
    public static double printShapes(Shape[] shapes) {
        double retVal = 0;

        for(Shape s : shapes)
            retVal += s.getArea();
        return retVal;
    }

    public static void main(String[] args) {
        Shape[] sh = new Shape[3];
        sh[0] = new Circle(3);
        sh[1] = new Rectangle(3);
        sh[2] = new Triangle(3);

        double totShape;

        totShape = printShapes(sh);
        System.out.println("The shape:" + totShape);
    }
}

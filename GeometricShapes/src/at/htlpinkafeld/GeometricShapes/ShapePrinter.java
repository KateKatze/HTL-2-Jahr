package at.htlpinkafeld.GeometricShapes;

public class ShapePrinter {

    public static void printShapes(Shape[] shapes) {
        double area = 0;
        for(Shape s : shapes) {
            area += s.getArea();
        }
        System.out.println("Total area: " + String.format("%.2f", area));

        int i = 0;
        for(Shape s : shapes)
            System.out.println("Shape " + ++i + ": " + s);
    }

    public static void main(String[] args) {
        Shape[] sh = new Shape[3];
        sh[0] = new Circle(5);
        sh[1] = new Rectangle(3, 4);
        sh[2] = new Triangle(3, 5, 7);

        System.out.println("Number of shapes: " + sh.length);
        printShapes(sh);
    }
}

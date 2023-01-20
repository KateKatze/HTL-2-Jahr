package at.htlpinkafeld.FirstInterface;

public class TestingTheSizeInterface {
    public static long calcArea(Size sz) {
        return (long) sz.getLength() * sz.getWidth();
    }

    public static void main(String[] args) {
        Car myCar = new Car("Audi", 2010, 200, 4235, 1820, 1650);
        SoccerField field = new SoccerField();

        System.out.println("Auto:  " + calcArea(myCar));
        System.out.println("Platz: " + calcArea(field));
    }

}

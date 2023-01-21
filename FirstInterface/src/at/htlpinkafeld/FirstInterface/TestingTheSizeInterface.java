package at.htlpinkafeld.FirstInterface;

public class TestingTheSizeInterface {
    public static long calcArea(Size sz) {
        return (long) sz.getLength() * sz.getWidth();
    }

    public static void main(String[] args) {
        //Car myCar = new Car();
        SoccerField field = new SoccerField();

       // System.out.println("Auto:  " + calcArea(myCar));
        System.out.println("Platz: " + calcArea(field));
    }

}

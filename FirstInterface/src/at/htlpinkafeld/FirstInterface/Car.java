package at.htlpinkafeld.FirstInterface;

public class Car implements Size {
    private String brand;
    private int releaseDate;
    private int maxPower;
    private int length;
    private int width;
    private int height;

    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }

}

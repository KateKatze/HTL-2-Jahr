package at.htlpinkafeld.FirstInterface;

public class Car implements Size, Comparable {
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

    // class SomeClass extend Baseclass implements Int1, Int2 {}

    public Car (String brand, int releaseDate, int maxPower, int length, int width, int height){
        this.brand=brand;
        this.releaseDate=releaseDate;
        this.maxPower=maxPower;
        this.length=length;
        this.width=width;
        this.height=height;
    }

    public int compareTo(Object o) {
        Car c = (Car)o;
        /*
        if(this.maxPower < c.maxPower)
            return -1;
        if(this.maxPower>c.maxPower)
            return +1;
        return 0;
         */
        return this.maxPower-c.maxPower;
    }

}

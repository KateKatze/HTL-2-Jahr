package org.kate;

public class Vehicle {
    public static void main(String[] a) {
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                '}';
    }


    private int wheels;

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public Vehicle(int wheelsIn) {
        setWheels(wheelsIn);
        // or this.wheels = wheels;
    }

    public Vehicle() {
        this.wheels = 0;
    }

}

package org.kate;

public class Car extends Vehicle {

    public Car() {
        super(4);
    }

    public Car(int wheelsIn) {
        super(wheelsIn);
    }

    @Override
    public String toString() {
        return "Car{" + getWheels() + "}";
    }
}

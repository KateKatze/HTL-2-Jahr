package at.htlpinkafeld.turtle;

import ch.aplu.turtle.Turtle;

public class TurtleCheck {
    public static void main(String[] args) {
        System.out.print("Welcome to the program 'RectangleRotation'! \n Press 'Run' and enjoy the spiiiiin :) ");

        Rectangle first = new Rectangle();
        first.thommy = new Turtle();
        first.width = 200;
        first.height = 100;
        first.x = 0;
        first.y = 100;
        first.angle = 10;
        // dividing angle through 360 degrees we will know exactly, how many times it needs to turn with this angle before it will reach the start point
        int counter = 360/first.angle;

        for (int i = 0; i <= counter; i++) {
            first.erase();
            first.draw();
            first.spin();
        }
    }

}

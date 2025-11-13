/**
 * Rectangle class takes in 2 doubles, length and width.
 * It provides constructors, getters, and setters for all instance variables.
 *
 * @author Shaoyang Chen
 * @version 114.514.1919.8.10
 */

public class Rectangle {
    private double width;
    private double length;

    /**
     * Constructs a rectangle with the specified length and width.
     *
     * @param length the length of the rectangle
     * @param width  the width of the rectangle
     */

    public Rectangle(double length, double width) {
        this.width = width;
        this.length = length;
    }

    /**
     * Constructs a rectangle with the default length and width. length = 4.0, width = 8.0
     */

    public Rectangle() {
        this.width = 8.0;
        this.length = 4.0;
    }

    /**
     * Constructs a rectangle with specified length and default width. width = 8.0
     *
     * @param length the length of the rectangle
     */

    public Rectangle(double length) {
        this.width = 8.0;
        this.length = length;
    }

    /**
     * Returns the width of the rectangle
     *
     * @return the width of the rectangle
     */
    public double getWidth() {
        return width;
    }

    /**
     * Returns the length of the rectangle
     *
     * @return the length of the rectangle
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the width of the rectangle
     *
     * @param width the width of the rectangle
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Sets the length of the rectangle
     *
     * @param length the length of the rectangle
     */
    public void setLength(double length) {
        this.length = length;
    }


}

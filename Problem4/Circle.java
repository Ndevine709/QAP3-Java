// Problem #4
public class Circle extends Ellipse {
    // Instance variable for radius
    private double radius;

    // Constructor - uses Ellipse constructor with radius for both axes
    public Circle(String name, double radius) {
        super(name, radius, radius);  
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }
}

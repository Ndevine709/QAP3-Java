// Problem #4
public class Ellipse extends Shape {
    // Instance variables for major (a) and minor (b) axes
    private double a;  
    private double b;  

    // Constructor 
    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        // If statement to assign larger value to a and smaller to b
        if (axis1 > axis2) {
            this.a = axis1;
            this.b = axis2;
        } else {
            this.a = axis2;
            this.b = axis1;
        }
    }

    // Getters 
    public double getMajorAxis() {
        return a;
    }

    public double getMinorAxis() {
        return b;
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }
}

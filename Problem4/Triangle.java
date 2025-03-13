// Problem #4
public class Triangle extends Shape {
    // Instance variables for the triangle sides
    private double side1;
    private double side2;
    private double side3;

    // Constructor with validation
    public Triangle(String name, double side1, double side2, double side3) {
        super(name); 
        if (!(side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2)) {
            System.out.println("Error: These side lengths cannot form a triangle");
            System.exit(1); 
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Getters
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }   

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public void scale(double factor) {
        // Scale all sides by the factor
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }
}

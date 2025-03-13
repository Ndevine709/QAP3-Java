// Problem #4
public class EquilateralTriangle extends Triangle {
    // Instance variable for side length (all sides are equal)
    private double side;

    // Constructor
    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side);  
        this.side = side;
    }

    // Getter for side
    public double getSide() {
        return side;
    }
}

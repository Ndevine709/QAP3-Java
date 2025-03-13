// Problem #4
public class Demo4 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Circle", 5);
        shapes[1] = new Triangle("Triangle", 3, 4, 5);
        shapes[2] = new Ellipse("Ellipse", 6, 4);
        shapes[3] = new EquilateralTriangle("Equilateral Triangle", 6);

        System.out.println("Testing for the Different Shapes:\n");
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println(); // Added a blank line for readability
        }
    }
}
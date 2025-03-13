// Problem #4
public class Demo4 {
    public static void scaleShapes(Scalable[] scalableObjects, double scaleFactor) {
        for (Scalable obj : scalableObjects) {
            obj.scale(scaleFactor);
        }
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Circle", 5);
        shapes[1] = new Triangle("Triangle", 3, 4, 5);
        shapes[2] = new Ellipse("Ellipse", 6, 4);
        shapes[3] = new EquilateralTriangle("Equilateral Triangle", 6);

        // Print shapes before scaling
        System.out.println("Original Shapes:\n");
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println(); // Added a blank line for readability
        }

        // Scale the shapes 
        scaleShapes((Scalable[])shapes, 2.0);

        // Print shapes after scaling
        System.out.println("\nShapes after scaling by factor of 2.0:\n");
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println(); // Added a blank line for readability
        }
    }
}
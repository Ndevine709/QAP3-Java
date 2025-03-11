// Problem #2 Demo
public class Demo2 {
    public static void main(String[] args) {
        // Test Point class
        Point point = new Point(2.0f, 3.0f);
        System.out.println("Point created with (x,y): " + point);
        
        float[] coordinates = point.getXY();
        System.out.println("Point coordinates using getXY(): x=" + coordinates[0] + ", y=" + coordinates[1]);
        
        point.setXY(4.0f, 5.0f);
        System.out.println("Point after setXY(4.0f, 5.0f): " + point);

        // Test MovablePoint class
        MovablePoint movablePoint = new MovablePoint(1.0f, 1.0f, 0.5f, 0.5f);
        System.out.println("\nMovablePoint created with position (1.0f,1.0f) and speed (0.5f,0.5f): " + movablePoint);
        
        movablePoint.move();
        System.out.println("MovablePoint after first move: " + movablePoint);
        
        movablePoint.setSpeed(1.0f, -1.0f);
        float[] speeds = movablePoint.getSpeed();
        System.out.println("New speeds using getSpeed(): xSpeed=" + speeds[0] + ", ySpeed=" + speeds[1]);
        
        movablePoint.move();
        System.out.println("MovablePoint after second move with new speeds: " + movablePoint);
    }
}

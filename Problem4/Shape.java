// Problem #4
public abstract class Shape implements Scalable {
    // Instance variable for the shape name
    private String name;
    
    // Constructors
    public Shape(String name) {
        this.name = name;
    }
    
    // Setter and abstract getters for area and perimeter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
    
    @Override
    public String toString() {
        return "Shape: " + name + 
               "\nArea: " + String.format("%.2f", getArea()) + 
               "\nPerimeter: " + String.format("%.2f", getPerimeter());
    }
}
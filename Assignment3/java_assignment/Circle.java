package java_assignment;
import java.lang.Math.*;

public class Circle extends Shapes {
    private int radius;
    public Circle (String color, int radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "Triangle[radius=" + radius + "]";
    }

    @Override
    public double getArea() {
        return 0.5 * Math.PI * Math.pow(radius, 2);
    }
}

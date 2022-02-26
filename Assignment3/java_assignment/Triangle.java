package java_assignment;

public class Triangle extends Shapes {
    private int base, height;

    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle[base=" + base + ",height=" + height + "]";
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

package java_assignment;
abstract public class Shapes {
    private String color;
    public Shapes () {}
    public Shapes(String color) {
        this.color = color;
    }
    public String color() {
        return "[color=" + color + "]";
    }

    abstract public double getArea();
}

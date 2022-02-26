package java_assignment;

public class Rectangular extends Shapes {
    private int length, width;
    public Rectangular(String color, int length, int width) {
        super(color) ;
        this.length = length;
        this.width = width;
    }
    @Override
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

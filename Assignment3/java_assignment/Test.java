package java_assignment;

public class Test {
    public static void main(String[] args) {
        Shapes s1 = new Rectangular("red", 4, 5);
        System.out.println(s1);
        System.out.println("Area is " + s1.getArea());
        System.out.println(s1.color());

        Shapes s2 = new Triangle("blue", 4, 5);
        System.out.println(s2);
        System.out.println("Area is " + s2.getArea());
        System.out.println(s2.color());

        Shapes s3 = new Circle("blue", 5);
        System.out.println(s3);
        System.out.println("Area is " + s3.getArea());
        System.out.println(s3.color());
        //compilation error: Shape is abstract; cannot be instantiated
    }
}


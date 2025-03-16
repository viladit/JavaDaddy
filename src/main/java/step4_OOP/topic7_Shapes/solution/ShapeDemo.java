package step4_OOP.topic7_Shapes.solution;

public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(12);
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println(circle.getArea() + "   " + circle.getPerimeter());
        System.out.println(rectangle.getArea() + "    " + rectangle.getPerimeter());
    }
}

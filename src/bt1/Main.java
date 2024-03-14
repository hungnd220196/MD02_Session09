package bt1;

public class Main {
    public static void main(String[] args) {
//Kiểm thử Class Shape
        System.out.println("-------- - SHAPE----------");

        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

//kiểm thử Class Circle
        System.out.println("-------- - CIRCLE----------");

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
//Kiểm thử RECTANGLE
        System.out.println("---------RECTANGLE----------");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
//Kiểm thử SQUARE
        System.out.println("---------SQUARE----------");

        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);

//Kiểm thử interface
        double x = (double) Math.floor(Math.random() * 10);
        double y = (double) Math.floor(Math.random() * 10);

        Circle circle1 = new Circle(x, "yellow", false);
        Rectangle rectangle1 = new Rectangle(x, y, "red", true);
        Square square1 = new Square(x, "orange", true);

        Shape[] shapes = {circle1, rectangle1, square1};
        System.out.println("truoc khi resize");
        for (Shape a : shapes) {
            System.out.println(a);
        }

        circle1.resize(Math.random() * 100);
        rectangle1.resize(Math.random() * 100);
        square1.resize(Math.random() * 100);
        System.out.println("Sau khi resize");
        for (Shape a : shapes) {
            System.out.println(a);
        }


    }
}

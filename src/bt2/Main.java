package bt2;

import bt1.Circle;
import bt1.Rectangle;
import bt1.Shape;
import bt1.Square;

public class Main {
    public static void main(String[] args) {
//Kiểm thử Class Shape
//        System.out.println("-------- - SHAPE----------");
//
//        bt1.Shape shape = new bt1.Shape();
//        System.out.println(shape);
//
//        shape = new bt1.Shape("red", false);
//        System.out.println(shape);
//
////kiểm thử Class Circle
//        System.out.println("-------- - CIRCLE----------");
//
//        bt1.Circle circle = new bt1.Circle();
//        System.out.println(circle);
//
//        circle = new bt1.Circle(3.5);
//        System.out.println(circle);
//
//        circle = new bt1.Circle(3.5, "indigo", false);
//        System.out.println(circle);
////Kiểm thử RECTANGLE
//        System.out.println("---------RECTANGLE----------");
//        bt1.Rectangle rectangle = new bt1.Rectangle();
//        System.out.println(rectangle);
//
//        rectangle = new bt1.Rectangle(2.3, 5.8);
//        System.out.println(rectangle);
//
//        rectangle = new bt1.Rectangle(2.5, 3.8, "orange", true);
//        System.out.println(rectangle);
////Kiểm thử SQUARE
//        System.out.println("---------SQUARE----------");
//
//        bt1.Square square = new bt1.Square();
//        System.out.println(square);
//
//        square = new bt1.Square(2.3);
//        System.out.println(square);
//
//        square = new bt1.Square(5.8, "yellow", true);
//        System.out.println(square);

        Circle circle = new Circle(3.5, "yellow", true);
        Rectangle rectangle = new Rectangle(2.0, 3.0, "red", false);
        Square square = new Square(4.0, "red", false);
        Rectangle rectangle1 = new Rectangle(2.9, 9.0, "red", true);
        Shape[] shapes = {circle, rectangle, square, rectangle1};
        for (Shape a : shapes) {
            System.out.println(a);
            if (a instanceof Square) {
                square.howtoColor();
            }
        }


    }
}

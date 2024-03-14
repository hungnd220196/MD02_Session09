import bt4.Circle;
import bt4.Rectangle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle("đen", 3.6);
        Rectangle rectangle1 = new Rectangle("red", 3.5, 9.2);
        System.out.println("màu của hình chữ nhật là ");
        rectangle1.display();
        System.out.println("Diện tích hình tròn là " + circle1.getArea());
        System.out.println("Diện tích hình chữ nhật là " + rectangle1.getArea());
        ;
    }
}
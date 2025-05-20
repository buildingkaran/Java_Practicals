package P2;
import P1.Shape;
import java.util.Scanner;

public class Rectangle extends Shape {
    int length, breadth;


    @Override
    public void read() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter length of the rectanlge: ");
            length = sc.nextInt();
            System.out.print("Enter breadth of the rectangle: ");
            breadth = sc.nextInt();
        }
    }

    @Override
    public void area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}
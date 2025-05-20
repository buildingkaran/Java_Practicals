package P3;
import P1.Shape;
import java.util.Scanner;

public class Circle extends Shape {
    int radius;

    @Override
    public void read() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter radius: ");
            radius = sc.nextInt();
            sc.close();
        }
    }

    @Override
    public void area() {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}
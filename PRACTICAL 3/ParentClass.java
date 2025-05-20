import P1.Shape;
import P2.Rectangle;
import P3.Circle;
import java.util.Scanner;

public class ParentClass {
    public static void main(String[] args) {
        Shape s;
        int choice;
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 for Rectangle or 2 for Circle:");
            choice = sc.nextInt();
        
        if (choice == 1) {
            s = new Rectangle();
            s.read();
        s.area();
        } else {
            s = new Circle();
            s.read();
        s.area();
        }

        
    }
}

import P1.TwoDim;
import P2.ThreeDim;

public class MainClass {
    public static void main(String[] args) {
        TwoDim ref;

        ref = new TwoDim(2, 3);
        System.out.println(ref);

        ref = new ThreeDim(4, 5, 6);
        System.out.println(ref);
    }
}
public class Complex {
    double x;
    double y;

    Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Complex add(Complex c) {
        return new Complex(this.x + c.x, this.y + c.y);
    }

    Complex multiply(Complex c) {
        double real = this.x * c.x - this.y * c.y;
        double imag = this.x * c.y + this.y * c.x;
        return new Complex(real, imag);
    }

    @Override
    public String toString() {
        return x  +  " + " + y + "i";
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, 5);
        Complex sum = c1.add(c2);
        Complex product = c1.multiply(c2);
        
        System.out.println("1st Complex No.: " + c1.toString());
        System.out.println("2nd Complex No.: " + c2.toString());
        System.out.println("Sum of the two given  complex numbers is: " + sum.toString());
        System.out.println("Product of the two given complex numbers is: " + product.toString());
    }
}
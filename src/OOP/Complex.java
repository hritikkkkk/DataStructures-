package OOP;

public class Complex {
    int real;
    int img;

    Complex(int real, int img) {
        this.real = real;
        this.img = img;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex(a.real + b.real, a.img + b.img);
    }

    public void printComplex() {
        System.out.println(real + " + " + img + "i");
    }

    public static void main(String[] args) {
        Complex a = new Complex(4, 5);
        Complex d = new Complex(9, 4);
        Complex e = add(a, d);

        e.printComplex();

    }
}

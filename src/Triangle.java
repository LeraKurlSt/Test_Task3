public class Triangle {
    private double a;
    private double b;
    private double c;

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public Triangle(double a, double b, double c) throws Exception {
        if ((a * b * c == 0) || (b + c < a) || (c + a < b) || (a + b < c)|| (a < 0) || (b < 0) || (c < 0)) {
            throw new Exception("Such triangle can not exist");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double Perimeter(){
        return (a + b + c) / 2;
    }

    public double Square(){
        double S = (a + b + c) / 2;
        return Math.sqrt(S * (S - a) * (S - b) * (S - c));
    }
}

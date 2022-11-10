package LFP.Day2;

public class Quadratic {
    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void rootsOfQuadraticEquation() {
        double r1 = -b + Math.sqrt((b * b - 4 * a * c) / 2 * a);
        double r2 = -b - Math.sqrt((b * b - 4 * a * c) / 2 * a);
        System.out.println(r1 + "," + r2);
    }
}

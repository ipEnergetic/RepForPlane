package by.softclub.by;

public class Point {
    private double x1, y1;

    Point() {
    }

    Point(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
        System.out.println("Created POINT with coordinates X1: " + x1 + " Y1: " + y1);
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }
}

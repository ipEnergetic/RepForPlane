package by.softclub.by;

public class Line {
    private double x, y; // coordinates of Intersection lines
    private double x1, x2, y1, y2, k, b;
    Point pointOfIntersectionLines; // point of Intersection lines

    Line(Point point1, Point point2) {
        this.x1 = point1.getX1();
        this.y1 = point1.getY1();
        this.x2 = point2.getX1();
        this.y2 = point2.getY1();
        findK();
        findB();
        System.out.println("Created LINE with view: " + k + "x + " + b + " = y");
    }

    Line(Segment segment) {
        this.x1 = segment.getX1();
        this.y1 = segment.getY1();
        this.x2 = segment.getX2();
        this.y2 = segment.getY2();
        findK();
        findB();
        System.out.println("Created LINE with view: " + k + "x + " + b + " = y");
    }

    public void findK() {
        double koefA, koefB;
        koefA = y1 - y2;
        koefB = x2 - x1;
        if (koefB >= 0)
            k = -koefA / koefB;
        else
            k = koefA / koefB;
    }

    public void findB() {
        double koefB, koefC;
        koefB = x2 - x1;
        koefC = x1 * y2 - x2 * y1;
        if (koefB > 0 && koefC != 0)
            b = -koefC / koefB;
        else if (koefB > 0 && koefC == 0)
            b = 0;
        else
            b = koefC / koefB;
    }

    public void pointOfIntersectionLines(Line line) {
        this.x = ((line.b - this.b) / (this.k - line.k));
        this.y = line.k * x + line.b;
        pointOfIntersectionLines = new Point(x, y);
        System.out.println("Point of Intersection Lines is X: " + x + " Y " + y);
    }


    public void isParalleLine(Line line) {
        if (this.k == line.k)
            System.out.println("Lines are PARALLEL");
        else
            System.out.println("Lines are NOT PARALLEL");
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getK() {
        return k;
    }

    public double getB() {
        return b;
    }
    
    public Point getPointIntersectionLines() {
        return pointOfIntersectionLines;
    }
}

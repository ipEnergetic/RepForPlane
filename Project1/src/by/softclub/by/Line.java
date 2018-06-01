package by.softclub.by;

public class Line {
    private double x1, x2, y1, y2, k, b;

    Line() {
    }

    Line(Point point1, Point point2) {
        this.x1 = point1.getX1();
        this.y1 = point1.getY1();
        this.x2 = point2.getX1();
        this.y2 = point2.getY1();
        findK();
        findB();
        System.out.println("Created LINE with view: " + k + "x + " + b + " = y");
    }

    void findK() {
        double koefA, koefB;
        koefA = y1 - y2;
        koefB = x2 - x1;
        if (koefB >= 0)
            k = -koefA / koefB;
        else
            k = koefA / koefB;
    }

    void findB() {
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

    void isParalleLine(Line line) {
        if (this.k == line.k)
            System.out.println("Lines are PARALLEL");
        else
            System.out.println("Lines are NOT PARALLEL");
    }
}

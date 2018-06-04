package by.softclub.by;

import java.util.ArrayList;

public class MainClassPlane {
    public static void main(String[] args) {
        Point point1 = new Point(10, 10);
        Point point2 = new Point(6, 2);
        Point point3 = new Point(2, 6);
        Point point4 = new Point(6, 7);
        Point point5 = new Point(8, 7);
        Point point6 = new Point(6, 9);
        Segment segment1 = new Segment(point1, point2);
        Segment segment2 = new Segment(point1, point3);
        Segment segment3 = new Segment(point4, point5);
        Segment segment4 = new Segment(point4, point6);

        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point3, point4);

        Angular angular = new Angular(line1, line2);
        System.out.println((float)angular.getAlpha());

        Circle circle1 = new Circle(0, 0, 12);
        Circle circle2 = new Circle(3, 5, 11);
        circle1.equalsSquareCircles(circle2);

        RightTriangle rightTriangle1 = new RightTriangle(segment1, segment2);
        RightTriangle rightTriangle2 = new RightTriangle(segment3, segment4);

        rightTriangle1.isSimilarTriangle(rightTriangle2);

        double rIn1, rIn2, rOut;

        rIn1 = 6 / (2 * Math.tan(Math.toRadians(180 / 7)));
        rIn2 = 2 / (2 * Math.tan(Math.toRadians(180 / 4)));
        System.out.println(rIn1);
        System.out.println(rIn2);
        
        RihgtPolygon rihgtPolygon = new RihgtPolygon(point1, 7, 6);
        
        Rectangle rectangle1 = new Rectangle(3, 8);
        Rectangle rectangle2 = new Rectangle(6, 4);
        
        rectangle1.equalSquareRectangle(rectangle2);
        
        
    }
}

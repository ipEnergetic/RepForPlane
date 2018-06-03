package by.softclub.by;

import java.util.ArrayList;

public class MainClassPlane {
    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(-5, 0);
        Point point3 = new Point(0, 0);
        Point point4 = new Point(-5, 8);
        Segment segment1 = new Segment(point1, point2);
        segment1.lengthOfSegment();

        Segment segment2 = new Segment(point3, point4);
        System.out.println(segment1.lengthOfSegment());

        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point3, point4);

        Angular angular = new Angular(line1, line2);
        System.out.println((float)angular.getAlpha());

    }
}

package by.softclub.by;

import java.util.ArrayList;

public class MainClassPlane {
    public static void main(String[] args) {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(2, 2);
        Point point3 = new Point(-3, 1);
        Point point4 = new Point(-2, 3);
        Segment segment1 = new Segment(point1, point2);
        Segment segment2 = new Segment(point3, point4);
        System.out.println(segment1.lengthOfSegment());

        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point3, point4);

        segment1.isEqualSegments(segment2);

        line1.isParalleLine(line2);

    }
}

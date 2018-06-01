package by.softclub.by;

public class Segment extends Point {
    private double x1, x2, y1, y2;
    private double lengthOfSegment;
    private boolean isEqualSegments;

    Segment() {
    }

    Segment(Point point1, Point point2) {
        this.x1 = point1.getX1();
        this.y1 = point1.getY1();
        this.x2 = point2.getX1();
        this.y2 = point2.getY1();
        System.out.println("Created SEGMENT with coordinates X1: " + x1 + " Y1: " + y1 + " X2: " + x2 + " Y2: " + y2);
    }

    double lengthOfSegment() {
        lengthOfSegment = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return lengthOfSegment;
    }

    boolean isEqualSegments(Segment segment) {
        isEqualSegments = this.lengthOfSegment() == segment.lengthOfSegment();
        if (isEqualSegments)
            System.out.println("Segments are EQUAL");
        else
            System.out.println("Segments are NOT EQUAL");
        return isEqualSegments;
    }
}

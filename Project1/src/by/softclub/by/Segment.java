package by.softclub.by;

public class Segment {
    private double x1, x2, y1, y2;
    Point pointOneSeg, pointTwoSeg;
    Point pointOfGeneralStartSegments;
    Point pointOfIntersectionSegments;
    private double lengthOfSegment;
    private boolean isEqualSegments;

    Segment(Point point1, Point point2) {
        this.x1 = point1.getX1();
        this.y1 = point1.getY1();
        this.x2 = point2.getX1();
        this.y2 = point2.getY1();
        pointOneSeg = point1;
        pointTwoSeg = point2;
        System.out.println("Created SEGMENT with coordinates X1: " + x1 + " Y1: " + y1 + " X2: " + x2 + " Y2: " + y2);
    }

    public double lengthOfSegment() {
        lengthOfSegment = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return lengthOfSegment;
    }

    public boolean isEqualSegments(Segment segment) {
        isEqualSegments = this.lengthOfSegment() == segment.lengthOfSegment();
        if (isEqualSegments)
            System.out.println("Segments are EQUAL");
        else
            System.out.println("Segments are NOT EQUAL");
        return isEqualSegments;
    }

    public boolean isIntersectionSegments(Segment segment) {
        Line line1 = new Line(this);
        Line line2 = new Line(segment);
        line1.pointOfIntersectionLines(line2);
        if (line1.getPointIntersectionLines().isPointBelongSegment(segment)) {
            System.out.println("Segments are Intersection");
            return true;
        } else {
            System.out.println("Segments are NOT Intersection");
            return false;
        }
    }

    public boolean isGeneralStartOfSegments(Segment segment) {
        if (this.isIntersectionSegments(segment)) {
            if (this.pointOfIntersectionSegments.equalsPoint(segment.pointOneSeg) ||
                this.pointOfIntersectionSegments.equalsPoint(segment.pointTwoSeg)) {
                System.out.println("General start of segments: X: " + pointOfGeneralStartSegments.getX1() + " Y: " +
                                   pointOfGeneralStartSegments.getY1());
                return true;
            } else {
                System.out.println("Segments are not general star");
                return false;
            }
        } else {
            System.out.println("Segments are not general star");
            return false;
        }
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }
    
    public Point getPointOfGeneralStartSegments() {
        return pointOfGeneralStartSegments;
    }

}


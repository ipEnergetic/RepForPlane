package by.softclub.by;

public class Angular {
    Line line1, line2;
    Segment segment1, segment2;
    Point pointOfAngular;
    private double alpha;

    Angular(Line line1, Line line2) {
        this.line1 = line1;
        this.line2 = line2;
        line1.pointOfIntersectionLines(line2);
        pointOfAngular = new Point(line1.getX(), line1.getY());
        makeAngularFromTwoLinesAndPoint();
    }

    Angular(Segment segment1, Segment segment2) {
        if (!segment1.isGeneralStartOfSegments(segment2)) {
            System.out.println("Angular can't created, becouse segments are not intersection");
        } else {
            this.segment1 = segment1;
            this.segment2 = segment2;
            pointOfAngular = segment1.pointOfIntersectionSegments;
            makeAngularFromTwoSegmentsAndPoint();
        }
    }

    Angular(Point pointOfAngular, Point point1, Point point2) {
        this.pointOfAngular = pointOfAngular;
        segment1 = new Segment(pointOfAngular, point1);
        segment2 = new Segment(pointOfAngular, point2);
    }

    private void makeAngularFromTwoSegmentsAndPoint() {
        Point point1 = new Point(segment1.getX2(), segment1.getY2());
        Point point2 = new Point(segment2.getX2(), segment2.getY2());
        Segment segment3 = new Segment(point1, point2);
        pointOfAngular.printPoint();
        point1.printPoint();
        point2.printPoint();
        double a, b, c, cosAlpha;
        a = segment1.lengthOfSegment();
        b = segment2.lengthOfSegment();
        c = segment3.lengthOfSegment();
        System.out.println(a + " " + b + " " + c);
        cosAlpha = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);
        alpha = Math.toDegrees(Math.acos(cosAlpha));
    }

    private void makeAngularFromTwoLinesAndPoint() {
        double abstrX = 2;
        double abstrY1, abstrY2;
        if (abstrX == pointOfAngular.getX1()) {
            abstrX = pointOfAngular.getX1() + 1;
        }
        abstrY1 = line1.getK() * abstrX + line1.getB();
        abstrY2 = line2.getK() * abstrX + line2.getB();
        Point point1 = new Point(abstrX, abstrY1);
        Point point2 = new Point(abstrX, abstrY2);
        segment1 = new Segment(pointOfAngular, point1);
        segment2 = new Segment(pointOfAngular, point2);
        makeAngularFromTwoSegmentsAndPoint();
    }

    private void makeAngularFromThreePoint() {
    }

    public double getAlpha() {
        return alpha;
    }
}

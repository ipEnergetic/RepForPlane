package by.softclub.by;

public class Point {
    private double x1, y1;

    Point(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
        System.out.println("Created POINT with coordinates X1: " + x1 + " Y1: " + y1);
    }

    public boolean equalsPoint (Point point){
        if (this.x1 == point.x1 && this.y1 == point.y1){
            System.out.println("Point are equals");
            return true;
        }else{
            System.out.println("Point are NOT equals");
            return false;
        }
    }

    public boolean isPointBelongSegment(Segment segment) {
        Line line = new Line(segment);
        if ((line.getK() * this.x1 + line.getB()) == this.y1) {
            return true;
        } else {
            return false;
        }
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }
    public void printPoint (){
        System.out.println(x1 + " " + y1);
    }
    
}

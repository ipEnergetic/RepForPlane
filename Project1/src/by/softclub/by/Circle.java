package by.softclub.by;

public class Circle {
    double pi = Math.PI;
    private Point pointCentrOfCircle;
    private double radius;
    private double lengthOfCircle;
    private double squareOfCircle;

    public Circle(double x, double y, double radius) {
        pointCentrOfCircle = new Point(x, y);
        this.radius = radius;
        lengthOfCircle();
        squareOfCircle();
        System.out.println("Created circle with centr X: " + pointCentrOfCircle.getX1() + " Y: " +
                           pointCentrOfCircle.getY1() + " radius: " + radius);
    }

    public void lengthOfCircle() {
        lengthOfCircle = 2 * pi * radius;
    }

    public void squareOfCircle() {
        squareOfCircle = pi * Math.pow(radius, 2);
    }

    public boolean equalsSquareCircles(Circle circle) {
        if (this.squareOfCircle == circle.squareOfCircle) {
        System.out.println("Circles are equals");
            return true;
        } else {
            System.out.println("Square of circles are NOT equals");
            return false;
        }
    }
}

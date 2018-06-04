package by.softclub.by;

public class Rectangle {
    double oneSideRectangle, twoSideRectangle;
    double squareRectangle;

    Rectangle(double oneSideRectangle, double twoSideRectangle) {
        this.oneSideRectangle = oneSideRectangle;
        this.twoSideRectangle = twoSideRectangle;
    }

    public double squareRectangle() {
        squareRectangle = oneSideRectangle * twoSideRectangle;
        return squareRectangle;
    }

    public void equalSquareRectangle(Rectangle rectangle) {
        if(this.squareRectangle() == rectangle.squareRectangle()){
            System.out.println("Rectangles are equal");
        }else{
            System.out.println("Rectangles are NOT equal");
        }
    }
}

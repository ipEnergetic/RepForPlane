package by.softclub.by;

import java.util.ArrayList;

public class RihgtPolygon {
    ArrayList<Point> listPointsOfRihgtPolygon;
    Point centerOfRihgtPolygon;
    int countSideOfRihgtPolygon;
    double lengthSideOfRihgtPolygon;
    Point pointOfRihgtPolygon;
    double lengthRadiusInOfRihgtPolygon;
    double lengthRadiusOutOfRihgtPolygon;
    double angularOfRaund;

    RihgtPolygon(Point centerOfRihgtPolygon, int countSideOfRihgtPolygon, double lengthSideOfRihgtPolygon) {
        this.centerOfRihgtPolygon = centerOfRihgtPolygon;
        this.countSideOfRihgtPolygon = countSideOfRihgtPolygon;
        this.lengthSideOfRihgtPolygon = lengthSideOfRihgtPolygon;
        angularOfRaund = (double)360 / countSideOfRihgtPolygon;
        makeRihgtPolygon();
    }

    public void makeRihgtPolygon() {
        lengthRadiusInOfRihgtPolygon();
        lengthRadiusOutOfRihgtPolygon();
        roundPointOfRihgtPolygon();
    }

    public void roundPointOfRihgtPolygon() {
        System.out.println("Проверка " + angularOfRaund);
        double round = 0;
        double x, y;
        listPointsOfRihgtPolygon = new ArrayList<Point>();
        for (int i = 0; i < countSideOfRihgtPolygon; i++) {
            x = centerOfRihgtPolygon.getX1() + lengthRadiusOutOfRihgtPolygon * Math.cos(Math.toRadians(round));
            y = centerOfRihgtPolygon.getY1() + lengthRadiusOutOfRihgtPolygon * Math.sin(Math.toRadians(round));
            pointOfRihgtPolygon = new Point(x, y);
            listPointsOfRihgtPolygon.add(pointOfRihgtPolygon);
            round = round + angularOfRaund;
        }
    }

    public void lengthRadiusInOfRihgtPolygon() {
        lengthRadiusInOfRihgtPolygon =
                lengthSideOfRihgtPolygon / (2 * Math.tan(Math.toRadians(180 / countSideOfRihgtPolygon)));
    }

    public void lengthRadiusOutOfRihgtPolygon() {
        lengthRadiusOutOfRihgtPolygon =
                lengthSideOfRihgtPolygon / (2 * Math.sin(Math.toRadians(180 / countSideOfRihgtPolygon)));
    }

}

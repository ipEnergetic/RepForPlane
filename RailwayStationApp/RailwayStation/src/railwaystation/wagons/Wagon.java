package railwaystation.wagons;

public abstract class Wagon {
    private double weightWagon;
    private double lengthWagon;
    private double widthWagon;
    private int countAxle;

    public abstract void getShipWagon();      //Загружать вагон

    public void setWeightOfWagon(double weightOfWagon) {
        this.weightWagon = weightOfWagon;
    }

    public double getWeightOfWagon() {
        return weightWagon;
    }

    public void setLengthWagon(double lengthWagon) {
        this.lengthWagon = lengthWagon;
    }

    public double getLengthWagon() {
        return lengthWagon;
    }

    public void setWidthWagon(double widthWagon) {
        this.widthWagon = widthWagon;
    }

    public double getWidthWagon() {
        return widthWagon;
    }

    public void setCountAxle(int countAxle) {
        this.countAxle = countAxle;
    }

    public int getCountAxle() {
        return countAxle;
    }
}

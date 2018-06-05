package railwaystation.blocktrains.wagons;

public abstract class Wagon {
    private double maxTransportedMass;       // Максимальная масса загрузки
    private double weightOfWagon;            // Масса вагона
    private double lengthWagon;              // Длина вагона
    
    public abstract void getShipWagon();        //загружать вагон


    public void setMaxTransportedMass(double maxTransportedMass) {
        this.maxTransportedMass = maxTransportedMass;
    }

    public double getMaxTransportedMass() {
        return maxTransportedMass;
    }

    public void setWeightOfWagon(double weightOfWagon) {
        this.weightOfWagon = weightOfWagon;
    }

    public double getWeightOfWagon() {
        return weightOfWagon;
    }

    public void setLengthWagon(double lengthWagon) {
        this.lengthWagon = lengthWagon;
    }

    public double getLengthWagon() {
        return lengthWagon;
    }
}

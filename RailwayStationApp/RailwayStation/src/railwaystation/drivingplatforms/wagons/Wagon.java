package railwaystation.drivingplatforms.wagons;

import railwaystation.drivingplatforms.DrivingPlatform;

public abstract class Wagon extends DrivingPlatform{
    private String typeWagon;
    private int weightWagon;
    private int lengthWagon;
    private int valume;

    public abstract void getShipWagon();      //Загружать вагон


    public void setTypeWagon(String typeWagon) {
        this.typeWagon = typeWagon;
    }

    public String getTypeWagon() {
        return typeWagon;
    }

    public void setWeightWagon(int weightWagon) {
        this.weightWagon = weightWagon;
    }

    public int getWeightWagon() {
        return weightWagon;
    }

    public void setLengthWagon(int lengthWagon) {
        this.lengthWagon = lengthWagon;
    }

    public int getLengthWagon() {
        return lengthWagon;
    }

    public void setValume(int valume) {
        this.valume = valume;
    }

    public int getValume() {
        return valume;
    }
}

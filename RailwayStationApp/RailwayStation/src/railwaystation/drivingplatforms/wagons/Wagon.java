package railwaystation.drivingplatforms.wagons;

import railwaystation.drivingplatforms.DrivingPlatform;

public abstract class Wagon extends DrivingPlatform {
    private String typeOfCargo;
    private String typeWagon;
    private int capacity;
    private int weightWagon;
    private int lengthWagon;
    private int valume;
    private int requireVolume;
    private int filledVolume;

    public abstract void getShipWagon(); //Загружать вагон


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

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setRequireVolume(int requireVolume) {
        this.requireVolume = requireVolume;
    }

    public int getRequireVolume() {
        return requireVolume;
    }

    public void setFilledVolume(int filledVolume) {
        this.filledVolume = filledVolume;
    }

    public int getFilledVolume() {
        return filledVolume;
    }

    public void setTypeOfCargo(String typeOfCargo) {
        this.typeOfCargo = typeOfCargo;
    }

    public String getTypeOfCargo() {
        return typeOfCargo;
    }
}

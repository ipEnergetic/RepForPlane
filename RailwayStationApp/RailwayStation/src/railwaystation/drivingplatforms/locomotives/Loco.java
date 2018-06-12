package railwaystation.drivingplatforms.locomotives;

import java.util.ArrayList;

import railwaystation.drivingplatforms.DrivingPlatform;

public abstract class Loco extends DrivingPlatform{
    private String typeLoco;
    private int lengthLoco;
    private int weightLoco;
    private int maxTransportedMassLoco;

    public abstract void moveBlockTrains();

    public void setTypeLoco(String typeLoco) {
        this.typeLoco = typeLoco;
    }

    public String getTypeLoco() {
        return typeLoco;
    }

    public void setLengthLoco(int lengthLoco) {
        this.lengthLoco = lengthLoco;
    }

    public int getLengthLoco() {
        return lengthLoco;
    }

    public void setWeightLoco(int weightLoco) {
        this.weightLoco = weightLoco;
    }

    public int getWeightLoco() {
        return weightLoco;
    }

    public void setMaxTransportedMassLoco(int maxTransportedMassLoco) {
        this.maxTransportedMassLoco = maxTransportedMassLoco;
    }

    public int getMaxTransportedMassLoco() {
        return maxTransportedMassLoco;
    }
}

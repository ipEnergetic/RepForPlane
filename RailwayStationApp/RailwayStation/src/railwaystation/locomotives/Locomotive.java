package railwaystation.locomotives;

import java.util.ArrayList;

public abstract class Locomotive {
    private double lengthLoco;
    private double widthLoco;
    private double weightLoco;
    private double enginePowerLoco;
    private double maxTransportedMassLoco;
    private double speedLoco;

    public abstract void moveBlockTrains();

    public void setLengthLoco(double lengthLoco) {
        this.lengthLoco = lengthLoco;
    }

    public double getLengthLoco() {
        return lengthLoco;
    }

    public void setWidthLoco(double widthLoco) {
        this.widthLoco = widthLoco;
    }

    public double getWidthLoco() {
        return widthLoco;
    }

    public void setWeightLoco(double weightLoco) {
        this.weightLoco = weightLoco;
    }

    public double getWeightLoco() {
        return weightLoco;
    }

    public void setEnginePowerLoco(double enginePowerLoco) {
        this.enginePowerLoco = enginePowerLoco;
    }

    public double getEnginePowerLoco() {
        return enginePowerLoco;
    }

    public void setMaxTransportedMassLoco(double maxTransportedMassLoco) {
        this.maxTransportedMassLoco = maxTransportedMassLoco;
    }

    public double getMaxTransportedMassLoco() {
        return maxTransportedMassLoco;
    }

    public void setSpeedLoco(double speedLoco) {
        this.speedLoco = speedLoco;
    }

    public double getSpeedLoco() {
        return speedLoco;
    }
}

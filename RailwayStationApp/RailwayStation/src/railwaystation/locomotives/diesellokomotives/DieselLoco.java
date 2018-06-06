package railwaystation.locomotives.diesellokomotives;

import railwaystation.locomotives.Locomotive;

public class DieselLoco extends Locomotive {
    private double volumeOfFuelTank;

    public void moveOnDiesel() {

    }

    @Override
    public void moveBlockTrains() {
    }

    public void setVolumeOfFuelTank(double volumeOfFuelTank) {
        this.volumeOfFuelTank = volumeOfFuelTank;
    }

    public double getVolumeOfFuelTank() {
        return volumeOfFuelTank;
    }
}

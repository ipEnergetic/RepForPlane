package railwaystation.locomotives.diesel;

import railwaystation.locomotives.Loco;

public class DieselLoco extends Loco {
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

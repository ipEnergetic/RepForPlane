package railwaystation.locomotives.electrolocomotives;

import railwaystation.locomotives.Locomotive;

public class ElectroLoco extends Locomotive {
    private double workingElectricalVoltage;

    public void moveOnElectro() {
    }

    @Override
    public void moveBlockTrains() {
    }

    public void setWorkingElectricalVoltage(double workingElectricalVoltage) {
        this.workingElectricalVoltage = workingElectricalVoltage;
    }

    public double getWorkingElectricalVoltage() {
        return workingElectricalVoltage;
    }
}

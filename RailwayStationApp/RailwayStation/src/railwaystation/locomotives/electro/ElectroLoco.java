package railwaystation.locomotives.electro;

import railwaystation.locomotives.Loco;

public class ElectroLoco extends Loco {
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

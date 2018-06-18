package railwaystation.deliveries.cargo;

import java.util.ArrayList;

import railwaystation.deliveries.cargo.interfacescondition.Bulk;
import railwaystation.deliveries.cargo.interfacescondition.Dangerous;
import railwaystation.deliveries.cargo.interfacescondition.Flow;
import railwaystation.deliveries.cargo.interfacescondition.Freeze;
import railwaystation.deliveries.cargo.interfacescondition.Gaseus;
import railwaystation.deliveries.cargo.interfacescondition.Packed;

public abstract class CommodityCargo extends Cargo{
    private String typeOfCargo;
    private int volumeOfCargo;
    private int weightOfCargo;
    private boolean isNeedToFreeze = false;
    private boolean isDangerous = false;

























    public void setTypeOfCargo(String typeOfCargo) {
        this.typeOfCargo = typeOfCargo;
    }

    public String getTypeOfCargo() {
        return typeOfCargo;
    }

    public void setVolumeOfCargo(int countOfCargo) {
        this.volumeOfCargo = countOfCargo;
    }

    public int getVolumeOfCargo() {
        return volumeOfCargo;
    }

    public void setIsNeedToFreeze(boolean isNeedToFreeze) {
        this.isNeedToFreeze = isNeedToFreeze;
    }

    public boolean isIsNeedToFreeze() {
        return isNeedToFreeze;
    }

    public void setIsDangerous(boolean isDangerous) {
        this.isDangerous = isDangerous;
    }

    public boolean isIsDangerous() {
        return isDangerous;
    }

    public void setWeightOfCargo(int weightOfCargo) {
        this.weightOfCargo = weightOfCargo;
    }

    public int getWeightOfCargo() {
        return weightOfCargo;
    }
}

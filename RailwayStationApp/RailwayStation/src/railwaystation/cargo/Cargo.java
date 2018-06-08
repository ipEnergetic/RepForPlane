package railwaystation.cargo;

import java.util.ArrayList;

import railwaystation.cargo.condition.Bulk;
import railwaystation.cargo.condition.Dangerous;
import railwaystation.cargo.condition.Flow;
import railwaystation.cargo.condition.Freeze;
import railwaystation.cargo.condition.Gaseus;
import railwaystation.cargo.condition.Packed;

public abstract class Cargo {
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

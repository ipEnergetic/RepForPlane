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
    private int countOfCargo;
    private String conditionOfCargo;
    private boolean isNeedToFreeze = false;
    private boolean isDangerous = false;

    /*
     * Выясняем параметры груза
     */

    public void initConditionOfCargo() {
        if (this instanceof Bulk) {
            setConditionOfCargo("bulk");
        } else if (this instanceof Flow) {
            setConditionOfCargo("flow");
        } else if (this instanceof Freeze) {
            setConditionOfCargo("freeze");
        } else if (this instanceof Gaseus) {
            setConditionOfCargo("gaseus");
        } else if (this instanceof Packed) {
            setConditionOfCargo("packed");
        }
        if (this instanceof Freeze) {
            setIsNeedToFreeze(true);
        }
        if (this instanceof Dangerous) {
            setIsDangerous(true);
        }
    }

    public void setTypeOfCargo(String typeOfCargo) {
        this.typeOfCargo = typeOfCargo;
    }

    public String getTypeOfCargo() {
        return typeOfCargo;
    }

    public void setCountOfCargo(int countOfCargo) {
        this.countOfCargo = countOfCargo;
    }

    public int getCountOfCargo() {
        return countOfCargo;
    }

    public void setConditionOfCargo(String conditionOfCargo) {
        this.conditionOfCargo = conditionOfCargo;
    }

    public String getConditionOfCargo() {
        return conditionOfCargo;
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
}

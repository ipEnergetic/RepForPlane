package railwaystation.order.cargo;

import java.util.ArrayList;

public class Cargo {
    ArrayList<Cargo> listOfCargo;
    private String typeOfCargo;
    private double countOfCargo;
    private boolean isNeedToFreeze;

    public void setTypeOfCargo(String typeOfCargo) {
        this.typeOfCargo = typeOfCargo;
    }

    public String getTypeOfCargo() {
        return typeOfCargo;
    }

    public void setWieghtOfCargo(double wieghtOfCargo) {
        this.countOfCargo = wieghtOfCargo;
    }

    public double getWieghtOfCargo() {
        return countOfCargo;
    }

    public void setIsNeedToFreeze(boolean isNeedToFreeze) {
        this.isNeedToFreeze = isNeedToFreeze;
    }

    public boolean isIsNeedToFreeze() {
        return isNeedToFreeze;
    }
}

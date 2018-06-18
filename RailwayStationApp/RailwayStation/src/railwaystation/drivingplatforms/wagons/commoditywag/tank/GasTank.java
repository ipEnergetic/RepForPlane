package railwaystation.drivingplatforms.wagons.commoditywag.tank;

import railwaystation.drivingplatforms.wagons.Wagon;

import railwaystation.warehause.Warehause;

public class GasTank extends Wagon{
    
    public GasTank(int valume, String typeCargo, int proposedValume) {
        this.setValume(valume);
        if (proposedValume > valume) {
            setRequireVolume(valume);
        } else {
            setRequireVolume(proposedValume);
        }
        this.setTypeOfCargo(typeCargo);
        this.setLengthWagon(12);
        this.setWeightWagon(40);
        this.setTypeWagon("Gas Tank");
    }

    @Override
    public void getShipWagon() {
        if (Warehause.getGas() >= getRequireVolume()) {
            Warehause.setGas(Warehause.getGas()-getRequireVolume());
            setFilledVolume(getRequireVolume());
        } else {
            System.out.println("Невозможно произвести загрузку Gas - надостаточное количество на складе");
        }
    }
}

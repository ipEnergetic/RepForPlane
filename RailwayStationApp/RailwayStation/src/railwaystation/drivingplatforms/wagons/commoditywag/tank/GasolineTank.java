package railwaystation.drivingplatforms.wagons.commoditywag.tank;

import railwaystation.drivingplatforms.wagons.Wagon;

import railwaystation.warehause.Warehause;

public class GasolineTank extends Wagon{
    
    public GasolineTank(int valume, String typeCargo, int proposedValume) {
        this.setValume(valume);
        if (proposedValume > valume) {
            setRequireVolume(valume);
        } else {
            setRequireVolume(proposedValume);
        }
        this.setTypeOfCargo(typeCargo);
        this.setLengthWagon(12);
        this.setWeightWagon(25);
        this.setTypeWagon("Gasoline Tank");
    }
    
    @Override
    public void getShipWagon() {
        if (Warehause.getGasoline() >= getRequireVolume()) {
            Warehause.setGasoline(Warehause.getGasoline()-getRequireVolume());
            setFilledVolume(getRequireVolume());
        } else {
            System.out.println("Невозможно произвести загрузку Gasoline - надостаточное количество на складе");
        }
    }
}

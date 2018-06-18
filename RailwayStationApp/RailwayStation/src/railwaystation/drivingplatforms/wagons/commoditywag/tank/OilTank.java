package railwaystation.drivingplatforms.wagons.commoditywag.tank;

import railwaystation.drivingplatforms.wagons.Wagon;

import railwaystation.warehause.Warehause;

public class OilTank extends Wagon{

    public OilTank(int valume, String typeCargo, int proposedValume ) {    
        this.setValume(valume);
        if (proposedValume > valume) {
            setRequireVolume(valume);
        } else {
            setRequireVolume(proposedValume);
        }
        this.setTypeOfCargo(typeCargo);
        this.setLengthWagon(12);
        this.setWeightWagon(30);
        this.setTypeWagon("Oil Tank");
    }

    @Override
    public void getShipWagon() {
        if (Warehause.getOil() >= getRequireVolume()) {
            Warehause.setOil(Warehause.getOil()-getRequireVolume());
            setFilledVolume(getRequireVolume());
        } else {
            System.out.println("Невозможно произвести загрузку Oil - надостаточное количество на складе");
        }
    }
}

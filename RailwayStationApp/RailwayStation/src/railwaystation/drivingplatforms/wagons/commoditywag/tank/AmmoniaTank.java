package railwaystation.drivingplatforms.wagons.commoditywag.tank;

import railwaystation.drivingplatforms.wagons.Wagon;

import railwaystation.warehause.Warehause;

public class AmmoniaTank extends Wagon {

    public AmmoniaTank(int valume, String typeCargo, int proposedValume) {
        this.setValume(valume);
        if (proposedValume > valume) {
            setRequireVolume(valume);
        } else {
            setRequireVolume(proposedValume);
        }
        this.setTypeOfCargo(typeCargo);
        this.setLengthWagon(12);
        this.setWeightWagon(40);
        this.setTypeWagon("Ammonia Tank");

    }

    @Override
    public void getShipWagon() {
        if (Warehause.getAmmonia() >= getRequireVolume()) {
            Warehause.setAmmonia(Warehause.getAmmonia()-getRequireVolume());
            setFilledVolume(getRequireVolume());
        } else {
            System.out.println("Невозможно произвести загрузку Ammonia - надостаточное количество на складе");
        }
    }
}

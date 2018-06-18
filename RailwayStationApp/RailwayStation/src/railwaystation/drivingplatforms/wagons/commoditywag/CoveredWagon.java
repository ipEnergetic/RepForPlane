package railwaystation.drivingplatforms.wagons.commoditywag;

import railwaystation.drivingplatforms.wagons.Wagon;

import railwaystation.warehause.Warehause;

public class CoveredWagon extends Wagon {

    public CoveredWagon(int valume, String typeCargo, int proposedValume) {
        this.setValume(valume);
        if (proposedValume > valume) {
            setRequireVolume(valume);
        } else {
            setRequireVolume(proposedValume);
        }
        this.setTypeOfCargo(typeCargo);
        this.setLengthWagon(15);
        this.setWeightWagon(23);
        this.setTypeWagon("Covered Wagon");
    }

    @Override
    public void getShipWagon() {
        if (Warehause.getWheatPacked() >= getRequireVolume()) {
            Warehause.setWheatPacked(Warehause.getWheatPacked()-getRequireVolume());
            setFilledVolume(getRequireVolume());
        } else {
            System.out.println("Невозможно произвести загрузку WheatPacked - надостаточное количество на складе");
        }
    }
}

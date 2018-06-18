package railwaystation.drivingplatforms.wagons.commoditywag;

import railwaystation.drivingplatforms.wagons.Wagon;

import railwaystation.warehause.Warehause;

public class TimberTrack extends Wagon { // для перевозки леса

    public TimberTrack(int valume, String typeCargo, int proposedValume) {
        this.setValume(valume);
        if (proposedValume > valume) {
            setRequireVolume(valume);
        } else {
            setRequireVolume(proposedValume);
        }
        this.setTypeOfCargo(typeCargo);
        this.setLengthWagon(15);
        this.setWeightWagon(25);
        this.setTypeWagon("TimberTrack");
    }

    @Override
    public void getShipWagon() {
        if (Warehause.getWood() >= getRequireVolume()) {
            Warehause.setWood(Warehause.getWood()-getRequireVolume());
            setFilledVolume(getRequireVolume());
        } else {
            System.out.println("Невозможно произвести загрузку Wood - надостаточное количество на складе");
        }
    }
}

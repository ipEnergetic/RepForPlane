package railwaystation.drivingplatforms.wagons.commoditywag;

import railwaystation.drivingplatforms.wagons.Wagon;

import railwaystation.warehause.Warehause;

public class Dumpcar extends Wagon { // вагон-самосвал для сыпучих грузов

    public Dumpcar(int valume, String typeCargo, int proposedValume) {
        this.setValume(valume);
        if (proposedValume > valume) {
            setRequireVolume(valume);
        } else {
            setRequireVolume(proposedValume);
        }
        this.setTypeOfCargo(typeCargo);
        this.setLengthWagon(15);
        this.setWeightWagon(30);
        this.setTypeWagon("Dumpcar");

    }

    @Override
    public void getShipWagon() {
        if (Warehause.getSand() >= getRequireVolume()) {
            Warehause.setSand(Warehause.getSand()-getRequireVolume());
            setFilledVolume(getRequireVolume());
        } else {
            System.out.println("Невозможно произвести загрузку Sand - надостаточное количество на складе");
        }
    }
}

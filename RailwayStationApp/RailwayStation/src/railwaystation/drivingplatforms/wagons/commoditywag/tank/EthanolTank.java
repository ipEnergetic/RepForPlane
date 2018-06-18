package railwaystation.drivingplatforms.wagons.commoditywag.tank;

import railwaystation.drivingplatforms.wagons.Wagon;

import railwaystation.warehause.Warehause;

public class EthanolTank extends Wagon {

    public EthanolTank(int valume, String typeCargo, int proposedValume) {
        this.setValume(valume);
        if (proposedValume > valume) {
            setRequireVolume(valume);
        } else {
            setRequireVolume(proposedValume);
        }
        this.setTypeOfCargo(typeCargo);
        this.setLengthWagon(12);
        this.setWeightWagon(25);
        this.setTypeWagon("Ethanol Tank");
    }

    @Override
    public void getShipWagon() {
        if (Warehause.getEthanol() >= getRequireVolume()) {
            Warehause.setEthanol(Warehause.getEthanol()-getRequireVolume());
            setFilledVolume(getRequireVolume());
        } else {
            System.out.println("Невозможно произвести загрузку Ethanol - надостаточное количество на складе");
        }
    }
}

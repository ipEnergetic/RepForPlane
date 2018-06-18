package railwaystation.drivingplatforms.wagons.commoditywag;

import railwaystation.drivingplatforms.wagons.Wagon;

import railwaystation.warehause.Warehause;

public class HopperFood extends Wagon{

    public HopperFood(int valume, String typeCargo, int proposedValume) {
        this.setValume(valume);
        if (proposedValume > valume) {
            setRequireVolume(valume);
        } else {
            setRequireVolume(proposedValume);
        }
        this.setTypeOfCargo(typeCargo);
        this.setLengthWagon(14);
        this.setWeightWagon(30);
        this.setTypeWagon("HopperFood Wagon");
    }

    @Override
    public void getShipWagon() {
        
        if (Warehause.getWheatFlow() >= getRequireVolume()) {
            Warehause.setWheatFlow(Warehause.getWheatFlow()-getRequireVolume());
            setFilledVolume(getRequireVolume());
        } else {
            System.out.println("Невозможно произвести загрузку WheatFlow - надостаточное количество на складе");
        }
        
    }
}

package railwaystation.drivingplatforms.wagons.commoditywag;

import railwaystation.drivingplatforms.wagons.Wagon;

import railwaystation.warehause.Warehause;

public class Refrigerator extends Wagon{
    
    public Refrigerator (int valume, String typeCargo, int proposedValume) {
        this.setValume(valume);
        if (proposedValume > valume) {
            setRequireVolume(valume);
        } else {
            setRequireVolume(proposedValume);
        }
        this.setTypeOfCargo(typeCargo);
        this.setLengthWagon(14);
        this.setWeightWagon(25);
        this.setTypeWagon("Refrigerator");
    }
    
    @Override
    public void getShipWagon() {
        if (Warehause.getMeat() >= getRequireVolume()) {
            Warehause.setMeat(Warehause.getMeat()-getRequireVolume());
            setFilledVolume(getRequireVolume());
        } else {
            System.out.println("Невозможно произвести загрузку Meat - надостаточное количество на складе");
        }
    }
}

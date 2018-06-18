package railwaystation.drivingplatforms.wagons.commoditywag.tank;

import railwaystation.drivingplatforms.wagons.Wagon;

import railwaystation.warehause.Warehause;

public class SulphuricAcidTank extends Wagon{
    
    public SulphuricAcidTank (int valume, String typeCargo, int proposedValume) {
        this.setValume(valume);
        if (proposedValume > valume) {
            setRequireVolume(valume);
        } else {
            setRequireVolume(proposedValume);
        }
        this.setTypeOfCargo(typeCargo);
        this.setLengthWagon(12);
        this.setWeightWagon(40);
        this.setTypeWagon("SulphuricAcid Tank");
    }
    
    @Override
    public void getShipWagon() {
        if (Warehause.getSulphuricAcid() >= getRequireVolume()) {
            Warehause.setSulphuricAcid(Warehause.getSulphuricAcid()-getRequireVolume());
            setFilledVolume(getRequireVolume());
        } else {
            System.out.println("Невозможно произвести загрузку SulphuricAcid - надостаточное количество на складе");
        }
    }
}

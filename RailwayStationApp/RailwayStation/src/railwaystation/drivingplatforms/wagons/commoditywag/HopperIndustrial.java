package railwaystation.drivingplatforms.wagons.commoditywag;

import railwaystation.drivingplatforms.wagons.Wagon;

import railwaystation.warehause.Warehause;

public class HopperIndustrial extends Wagon{ // Хоппер - бункер для первозки сыпучих строительных грузов, а также зерна

    public HopperIndustrial(int valume, String typeCargo, int proposedValume) {
        this.setValume(valume);
        if (proposedValume > valume) {
            setRequireVolume(valume);
        } else {
            setRequireVolume(proposedValume);
        }
        this.setTypeOfCargo(typeCargo);
        this.setLengthWagon(14);
        this.setWeightWagon(30);
        this.setTypeWagon("Hopper Industrial");
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

package railwaystation.drivingplatforms.wagons.commoditywag;

import railwaystation.drivingplatforms.wagons.Wagon;

public class HopperIndustrial extends Wagon{ // Хоппер - бункер для первозки сыпучих строительных грузов, а также зерна

    public HopperIndustrial(int valume) {
        this.setLengthWagon(14);
        this.setWeightWagon(30);
        this.setTypeWagon("Hopper Industrial");
        this.setValume(valume);
    }

    @Override
    public void getShipWagon() {
    }
}

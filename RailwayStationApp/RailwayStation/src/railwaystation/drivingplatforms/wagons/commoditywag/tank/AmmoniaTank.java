package railwaystation.drivingplatforms.wagons.commoditywag.tank;

import railwaystation.drivingplatforms.wagons.Wagon;

public class AmmoniaTank extends Wagon {

    public AmmoniaTank(int valume) {
        this.setLengthWagon(12);
        this.setWeightWagon(40);
        this.setTypeWagon("Ammonia Tank");
        this.setValume(valume);
    }

    @Override
    public void getShipWagon() {
    }
}

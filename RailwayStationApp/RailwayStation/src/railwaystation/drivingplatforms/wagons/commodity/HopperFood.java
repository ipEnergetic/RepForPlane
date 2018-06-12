package railwaystation.drivingplatforms.wagons.commodity;

import railwaystation.drivingplatforms.wagons.Wagon;

public class HopperFood extends Wagon{

    public HopperFood(int valume) {
        this.setLengthWagon(14);
        this.setWeightWagon(30);
        this.setTypeWagon("HopperFood Wagon");
        this.setValume(valume);
    }

    @Override
    public void getShipWagon() {
    }
}

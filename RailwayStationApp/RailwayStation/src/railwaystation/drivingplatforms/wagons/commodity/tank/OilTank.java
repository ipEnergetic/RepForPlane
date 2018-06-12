package railwaystation.drivingplatforms.wagons.commodity.tank;

import railwaystation.drivingplatforms.wagons.Wagon;

public class OilTank extends Wagon{

    public OilTank(int valume) {
        this.setLengthWagon(12);
        this.setWeightWagon(30);
        this.setTypeWagon("Oil Tank");
        this.setValume(valume);
    }

    @Override
    public void getShipWagon() {
    }
}

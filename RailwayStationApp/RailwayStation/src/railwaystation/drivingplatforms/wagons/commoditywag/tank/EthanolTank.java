package railwaystation.drivingplatforms.wagons.commoditywag.tank;

import railwaystation.drivingplatforms.wagons.Wagon;

public class EthanolTank extends Wagon {

    public EthanolTank(int valume) {
        this.setLengthWagon(12);
        this.setWeightWagon(25);
        this.setTypeWagon("Ethanol Tank");
        this.setValume(valume);
    }

    @Override
    public void getShipWagon() {
    }
}

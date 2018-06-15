package railwaystation.drivingplatforms.wagons.commoditywag.tank;

import railwaystation.drivingplatforms.wagons.Wagon;

public class GasTank extends Wagon{
    
    public GasTank(int valume) {
        this.setLengthWagon(12);
        this.setWeightWagon(40);
        this.setTypeWagon("Gas Tank");
        this.setValume(valume);
    }

    @Override
    public void getShipWagon() {
    }
}

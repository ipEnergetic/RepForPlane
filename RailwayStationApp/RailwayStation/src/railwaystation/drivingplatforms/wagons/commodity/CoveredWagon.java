package railwaystation.drivingplatforms.wagons.commodity;

import railwaystation.drivingplatforms.wagons.Wagon;

public class CoveredWagon extends Wagon {

    public CoveredWagon(int valume) {
        this.setLengthWagon(15);
        this.setWeightWagon(23);
        this.setTypeWagon("Covered Wagon");
        this.setValume(valume);
    }

    @Override
    public void getShipWagon() {
    }
}

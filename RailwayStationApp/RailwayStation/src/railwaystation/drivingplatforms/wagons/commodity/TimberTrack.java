package railwaystation.drivingplatforms.wagons.commodity;

import railwaystation.drivingplatforms.wagons.Wagon;

public class TimberTrack extends Wagon { // для перевозки леса

    public TimberTrack(int valume) {
        this.setLengthWagon(15);
        this.setWeightWagon(25);
        this.setTypeWagon("TimberTrack");
        this.setValume(valume);
    }

    @Override
    public void getShipWagon() {
    }
}

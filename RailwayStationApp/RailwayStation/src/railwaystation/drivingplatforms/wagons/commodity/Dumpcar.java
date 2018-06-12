package railwaystation.drivingplatforms.wagons.commodity;

import railwaystation.drivingplatforms.wagons.Wagon;

public class Dumpcar extends Wagon { // вагон-самосвал для сыпучих грузов

    public Dumpcar(int valume) {
        this.setLengthWagon(15);
        this.setWeightWagon(30);
        this.setTypeWagon("Dumpcar");
        this.setValume(valume);
    }

    @Override
    public void getShipWagon() {
    }
}

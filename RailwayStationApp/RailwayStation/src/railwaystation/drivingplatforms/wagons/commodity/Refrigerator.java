package railwaystation.drivingplatforms.wagons.commodity;

import railwaystation.drivingplatforms.wagons.Wagon;

public class Refrigerator extends Wagon{
    
    public Refrigerator (int valume) {
        this.setLengthWagon(14);
        this.setWeightWagon(25);
        this.setTypeWagon("Refrigerator");
        this.setValume(valume);
    }
    
    @Override
    public void getShipWagon() {
    }
}

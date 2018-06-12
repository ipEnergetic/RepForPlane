package railwaystation.drivingplatforms.wagons.commodity.tank;

import railwaystation.drivingplatforms.wagons.Wagon;

public class SulphuricAcidTank extends Wagon{
    
    public SulphuricAcidTank (int valume) {
        this.setLengthWagon(12);
        this.setWeightWagon(40);
        this.setTypeWagon("SulphuricAcid Tank");
        this.setValume(valume);
    }
    
    @Override
    public void getShipWagon() {
    }
}

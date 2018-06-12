package railwaystation.drivingplatforms.wagons.commodity.tank;

import railwaystation.drivingplatforms.wagons.Wagon;

public class GasolineTank extends Wagon{
    
    public GasolineTank(int valume) {
        this.setLengthWagon(12);
        this.setWeightWagon(25);
        this.setTypeWagon("Gasoline Tank");
        this.setValume(valume);
    }
    
    @Override
    public void getShipWagon() {
    }
}

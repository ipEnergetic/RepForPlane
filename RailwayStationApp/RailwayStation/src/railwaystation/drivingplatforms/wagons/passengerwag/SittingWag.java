package railwaystation.drivingplatforms.wagons.passengerwag;

import railwaystation.deliveries.cargo.interfacescondition.Sitting;


public class SittingWag extends PassengerWagon implements Sitting{

    public SittingWag() {
        this.setWeightWagon(50);
        this.setTypeWagon("Sitting");
        this.setLengthWagon(30);
        this.setCapacity(100);
    }
}

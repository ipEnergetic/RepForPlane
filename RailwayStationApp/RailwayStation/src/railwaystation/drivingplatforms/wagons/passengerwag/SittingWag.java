package railwaystation.drivingplatforms.wagons.passengerwag;

import railwaystation.cargo.interfacescondition.Sitting;


public class SittingWag extends PassengerWagon implements Sitting{

    public SittingWag() {
        this.setTypeWagon("Sitting");
        this.setLengthWagon(30);
        this.setCapacity(100);
    }
}

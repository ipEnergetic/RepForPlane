package railwaystation.drivingplatforms.wagons.passengerwag;

import railwaystation.deliveries.cargo.interfacescondition.Common;


public class CommonWag extends PassengerWagon{
    
    public CommonWag(){
        this.setWeightWagon(50);
        this.setTypeWagon("Common");
        this.setLengthWagon(30);
        this.setCapacity(60);
    }
}

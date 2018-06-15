package railwaystation.drivingplatforms.wagons.passengerwag;

import railwaystation.cargo.interfacescondition.Common;


public class CommonWag extends PassengerWagon{
    
    public CommonWag(){
        this.setTypeWagon("Common");
        this.setLengthWagon(30);
        this.setCapacity(60);
    }
}

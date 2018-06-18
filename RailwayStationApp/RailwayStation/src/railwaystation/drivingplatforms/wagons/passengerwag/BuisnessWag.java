package railwaystation.drivingplatforms.wagons.passengerwag;

import railwaystation.deliveries.cargo.interfacescondition.Buisness;


public class BuisnessWag extends PassengerWagon{
    
    public BuisnessWag(){
        this.setWeightWagon(50);
        this.setTypeWagon("Buisness");
        this.setLengthWagon(30);
        this.setCapacity(30);
    }
}

package railwaystation.drivingplatforms.wagons.passengerwag;

import railwaystation.cargo.interfacescondition.Buisness;


public class BuisnessWag extends PassengerWagon{
    
    public BuisnessWag(){
        this.setTypeWagon("Buisness");
        this.setLengthWagon(30);
        this.setCapacity(30);
    }
}

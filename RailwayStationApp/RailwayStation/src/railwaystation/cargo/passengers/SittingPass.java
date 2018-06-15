package railwaystation.cargo.passengers;

import railwaystation.cargo.Passenger;
import railwaystation.cargo.interfacescondition.Sitting;

public class SittingPass extends Passenger implements Sitting {
    public SittingPass() {
        this.setTypeOfPass("Passenger of Sitting");
        this.setAge((int)(Math.random() * 70));
        int countRandSex = (int)(1 + Math.random() * 2);
        if (countRandSex == 1)
            this.setSex("man");
        else
            this.setSex("woman");
    }
}

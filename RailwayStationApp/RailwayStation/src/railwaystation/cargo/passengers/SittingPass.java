package railwaystation.cargo.passengers;

import railwaystation.cargo.Passenger;

public class SittingPass  extends Passenger {
    public SittingPass() {
        this.setAge((int)(Math.random() * 70));
        int countRandSex = (int)(1 + Math.random() * 2);
        if (countRandSex == 1)
            this.setSex("man");
        else
            this.setSex("woman");
    }
}

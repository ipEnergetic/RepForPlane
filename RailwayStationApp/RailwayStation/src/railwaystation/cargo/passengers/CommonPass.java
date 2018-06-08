package railwaystation.cargo.passengers;

import railwaystation.cargo.Passenger;

public class CommonPass  extends Passenger {
    public CommonPass() {
        this.setAge((int)(Math.random() * 70));
        int countRandSex = (int)(1 + Math.random() * 2);
        if (countRandSex == 1)
            this.setSex("man");
        else
            this.setSex("woman");
    }
}

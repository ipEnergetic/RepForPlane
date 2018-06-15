package railwaystation.cargo.passengers;

import railwaystation.cargo.Passenger;
import railwaystation.cargo.interfacescondition.Buisness;
import railwaystation.cargo.interfacescondition.Common;

public class BuisnesPass extends Passenger implements Buisness {

    public BuisnesPass() {
        this.setTypeOfPass("Passenger of Buisness");
        this.setAge((int)(Math.random() * 70));
        int countRandSex = (int)(1 + Math.random() * 2);
        if (countRandSex == 1)
            this.setSex("man");
        else
            this.setSex("woman");
    }
}

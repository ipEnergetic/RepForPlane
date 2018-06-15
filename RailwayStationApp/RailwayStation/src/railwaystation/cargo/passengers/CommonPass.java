package railwaystation.cargo.passengers;

import railwaystation.cargo.Passenger;
import railwaystation.cargo.interfacescondition.Buisness;
import railwaystation.cargo.interfacescondition.Common;

public class CommonPass  extends Passenger implements Common{
    public CommonPass() {
        this.setTypeOfPass("Passenger of Common");
        this.setAge((int)(Math.random() * 70));
        int countRandSex = (int)(1 + Math.random() * 2);
        if (countRandSex == 1)
            this.setSex("man");
        else
            this.setSex("woman");
    }
}
